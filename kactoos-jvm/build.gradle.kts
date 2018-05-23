import org.gradle.api.publication.maven.internal.pom.DefaultMavenPom
import org.gradle.api.publish.maven.MavenPom
import org.jetbrains.dokka.gradle.DokkaTask
import org.jetbrains.dokka.gradle.LinkMapping
import org.jlleitschuh.gradle.ktlint.reporter.ReporterType

plugins {
    maven
    id("kotlin-platform-jvm")
    id("org.jetbrains.dokka") version "0.9.17"
    id("io.gitlab.arturbosch.detekt") version "1.0.0.RC7"
    id("org.jlleitschuh.gradle.ktlint") version "4.0.0"
}

dependencies {
    "expectedBy"(project(":kactoos-common"))
    "implementation"(kotlin("stdlib-jdk8"))
    "testCompile"(kotlin("test-testng"))
    testCompile(testng())
    "testCompile"(assertj())
}

configurations {
    detekt {
        version = "1.0.0.RC7"
        defaultProfile(
            Action {
                input = "$projectDir/src/main/kotlin"
                config = "$projectDir/detekt.yml"
                filters = ".*test.*,.*/resources/.*,.*/tmp/.*"
            }
        )
    }

    ktlint {
        version = "0.23.1"
        debug = true
        verbose = true
        android = false
        outputToConsole = true
        reporters = arrayOf(ReporterType.PLAIN_GROUP_BY_FILE, ReporterType.CHECKSTYLE)
        ignoreFailures = true
    }
}

tasks {

    "moveDocs"(Copy::class) {
        from("build/dokka/kactoos-jvm")
        into("../docs")
    }

    "dokka"(DokkaTask::class) {
        jdkVersion = 8
        outputFormat = "gfm"
        includes = listOf("src/dokka/extra.md", "src/dokka/packages.md")
        linkMappings = arrayListOf(
            LinkMapping().apply {
                dir = "$project.projectDir"
                url = "https://github.com/neonailol/kactoos/blob/master/kactoos-jvm"
                suffix = "#L"
            }
        )
        finalizedBy("moveDocs")
    }

    "test"(Test::class) {
        useTestNG()
    }

}

tasks["assemble"].dependsOn("dokka")
tasks["assemble"].dependsOn("detektCheck")
tasks["check"].dependsOn("ktlintCheck")
