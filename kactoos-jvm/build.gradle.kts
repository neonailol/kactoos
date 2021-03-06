import org.gradle.api.publication.maven.internal.pom.DefaultMavenPom
import org.gradle.api.publish.maven.MavenPom
import org.jetbrains.dokka.gradle.DokkaTask
import org.jetbrains.dokka.gradle.LinkMapping
import org.jlleitschuh.gradle.ktlint.reporter.ReporterType
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    maven
    id("kotlin-platform-jvm")
    id("org.jetbrains.dokka") version "0.9.17"
    id("io.gitlab.arturbosch.detekt") version "1.0.0.RC9"
    id("org.jlleitschuh.gradle.ktlint") version "6.0.0"
}

dependencies {
    expectedBy(project(":kactoos-common"))
    implementation(kotlin("stdlib-jdk8"))
    implementation(`atomicfu-jvm`())
    implementation(`coroutines-jvm`())
    testCompile(kotlin("test-testng"))
    testCompile(testng())
    testCompile(assertj())
}

detekt {
    toolVersion = "1.0.0.RC9"
    input = files("$projectDir/src/main/kotlin")
    config = files("$projectDir/detekt.yml")
    filters = ".*test.*,.*/resources/.*,.*/tmp/.*"
}

ktlint {
    version.set("0.28.0")
    debug.set(true)
    verbose.set(true)
    android.set(false)
    outputToConsole.set(true)
    reporters.set(setOf(ReporterType.PLAIN_GROUP_BY_FILE, ReporterType.JSON))
    ignoreFailures.set(true)
}

tasks {

    val cleanDocs by creating(Delete::class) {
        delete("$rootDir/docs/alltypes")
        delete("$rootDir/docs/nnl.rocks.kactoos")
        delete("$rootDir/docs/nnl.rocks.kactoos.bytes")
        delete("$rootDir/docs/nnl.rocks.kactoos.collection")
        delete("$rootDir/docs/nnl.rocks.kactoos.func")
        delete("$rootDir/docs/nnl.rocks.kactoos.io")
        delete("$rootDir/docs/nnl.rocks.kactoos.iterable")
        delete("$rootDir/docs/nnl.rocks.kactoos.iterator")
        delete("$rootDir/docs/nnl.rocks.kactoos.list")
        delete("$rootDir/docs/nnl.rocks.kactoos.map")
        delete("$rootDir/docs/nnl.rocks.kactoos.scalar")
        delete("$rootDir/docs/nnl.rocks.kactoos.text")
        delete("$rootDir/docs/nnl.rocks.kactoos.time")
    }

    val moveDocs by creating(Copy::class) {
        dependsOn("cleanDocs")
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

    withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
            javaParameters = true
            verbose = true
            freeCompilerArgs = listOf("-Xjsr305=strict")
        }
    }
}

tasks["assemble"].dependsOn("detekt")
tasks["check"].dependsOn("ktlintCheck")
