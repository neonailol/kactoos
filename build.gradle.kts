import org.gradle.kotlin.dsl.kotlin

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
        classpath(kotlin("gradle-plugin", "1.2.60"))
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
    }

    dependencies {
        subprojects.forEach {
            archives(it)
        }
    }
}

tasks.withType<Wrapper> {
    distributionType = Wrapper.DistributionType.ALL
    gradleVersion = "4.9"
}
