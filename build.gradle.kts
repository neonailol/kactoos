import org.gradle.kotlin.dsl.kotlin
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    base
    maven
    id("com.github.ben-manes.versions") version "0.17.0"
}

buildscript {
    repositories {
        mavenCentral()
    }

    dependencies {
        classpath(kotlin("gradle-plugin", "1.2.41"))
        classpath(kotlin("native-gradle-plugin", "0.7"))
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

tasks.withType<Wrapper> {
    distributionType = Wrapper.DistributionType.ALL
    gradleVersion = "4.7"
}
