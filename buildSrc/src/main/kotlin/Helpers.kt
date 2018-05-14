import org.gradle.api.artifacts.dsl.DependencyHandler

private object Versions {
    const val testng = "6.14.3"
    const val assertj = "3.10.0"
}

fun DependencyHandler.testng(): Any = "org.testng:testng:${Versions.testng}"

fun DependencyHandler.assertj(): Any = "org.assertj:assertj-core:${Versions.assertj}"
