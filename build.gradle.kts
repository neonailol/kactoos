import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    dependencies {
        classpath(kotlin("gradle-plugin", "1.2.31"))
    }
}

//
allprojects {
    group = "nnl.rocks.kactoos"
    version = "1.0-SNAPSHOT"

    buildscript {
        repositories {
            jcenter()
            mavenCentral()
            maven("https://plugins.gradle.org/m2/")
            maven("http://kotlin.bintray.com/kotlinx")
            maven("https://dl.bintray.com/jetbrains/kotlin-native-dependencies")
        }
    }

    tasks {
        withType<Test> {
            testLogging {
                showStandardStreams = true
                events("passed", "failed")
            }
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

    dependencies {
        subprojects.forEach {
            archives(it)
        }
    }
}

plugins {
    `base`
    id("com.github.ben-manes.versions") version "0.17.0"
}

project(":cactoos:") {
    apply { from("$rootProject.projectDir/build.cactoos.gradle") }
}
