import org.gradle.api.artifacts.dsl.DependencyHandler

private object Versions {
    const val kotlin = "1.2.70"
    const val testng = "6.14.3"
    const val assertj = "3.11.1"
    const val atomicfu = "0.11.7"
    const val coroutines = "0.26.1"
}

fun kotlinVersion(): Any = Versions.kotlin

fun DependencyHandler.testng(): Any = "org.testng:testng:${Versions.testng}"

fun DependencyHandler.assertj(): Any = "org.assertj:assertj-core:${Versions.assertj}"

fun DependencyHandler.`atomicfu-common`(): Any = "org.jetbrains.kotlinx:atomicfu-common:${Versions.atomicfu}"
fun DependencyHandler.`atomicfu-js`(): Any = "org.jetbrains.kotlinx:atomicfu-js:${Versions.atomicfu}"
fun DependencyHandler.`atomicfu-jvm`(): Any = "org.jetbrains.kotlinx:atomicfu:${Versions.atomicfu}"

fun DependencyHandler.`coroutines-common`(): Any = "org.jetbrains.kotlinx:kotlinx-coroutines-core-common:${Versions.coroutines}"
fun DependencyHandler.`coroutines-js`(): Any = "org.jetbrains.kotlinx:kotlinx-coroutines-core-js:${Versions.coroutines}"
fun DependencyHandler.`coroutines-jvm`(): Any = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
