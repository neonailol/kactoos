pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        jcenter()
        mavenCentral()
        maven("https://plugins.gradle.org/m2/")
        maven("http://kotlin.bintray.com/kotlinx")
        maven("https://dl.bintray.com/jetbrains/kotlin-native-dependencies")

    }
}

rootProject.name = "kactoos"

include("kactoos-common", "kactoos-jvm", "kactoos-js", "kactoos-native", "compatibility-tests")
