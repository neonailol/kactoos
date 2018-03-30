import org.jetbrains.dokka.gradle.DokkaTask
import org.jetbrains.dokka.gradle.LinkMapping
import org.jlleitschuh.gradle.ktlint.reporter.ReporterType

plugins {
    id("maven")
    id("kotlin-platform-jvm")
    id("org.jetbrains.dokka") version "0.9.16"
    id("io.gitlab.arturbosch.detekt") version "1.0.0.RC6-4"
    id("org.jlleitschuh.gradle.ktlint") version "3.2.0"
}

dependencies {
    "expectedBy"(project(":kactoos-common"))
    "implementation"(kotlin("stdlib-jdk8"))
    "testCompile"(kotlin("test-testng"))
    "testCompile"("org.testng:testng:6.14.2")
    "testCompile"("org.assertj:assertj-core:3.9.1")
}

configurations {
    detekt {
        version = "1.0.0.RC6-4"
        defaultProfile(
            Action {
                input = "$projectDir/src/main/kotlin"
                config = "$projectDir/detekt.yml"
                filters = ".*test.*,.*/resources/.*,.*/tmp/.*"
            }
        )
    }

    ktlint {
        version = "0.21.0"
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

tasks["check"].dependsOn("ktlintCheck")

tasks["assemble"].dependsOn("dokka")
tasks["assemble"].dependsOn("detektCheck")

