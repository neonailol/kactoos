import org.gradle.api.artifacts.dsl.DependencyHandler

private object Versions {
    const val testng = "6.14.3"
}

fun DependencyHandler.testng(): Any = "org.testng:testng:${Versions.testng}"
