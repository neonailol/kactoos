import org.gradle.kotlin.dsl.kotlin
import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask

plugins {
    base
    maven
    id("com.github.ben-manes.versions") version "0.20.0"
}

buildscript {
    repositories {
        mavenCentral()
    }

    dependencies {
        classpath(kotlin("gradle-plugin", "1.2.71"))
    }
}

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

    repositories {
        mavenCentral()
        jcenter()
        maven("https://jitpack.io")
    }

    tasks {
        withType(Test::class.java) {
            testLogging {
                showStandardStreams = true
                events("passed", "failed")
            }
        }
    }

    dependencies {
        subprojects.forEach {
            archives(it)
        }
    }
}

tasks.withType(Wrapper::class.java) {
    distributionType = Wrapper.DistributionType.ALL
    gradleVersion = "4.10.2"
}

tasks.withType(DependencyUpdatesTask::class.java) {
    resolutionStrategy {
        componentSelection {
            all {
                val rejected = listOf("alpha", "beta", "rc", "cr", "m", "preview")
                    .map { qualifier -> Regex("(?i).*[.-]$qualifier[.\\d-]*") }
                    .any { it.matches(candidate.version) }
                if (rejected) {
                    reject("RC")
                }
            }
        }
    }
}
