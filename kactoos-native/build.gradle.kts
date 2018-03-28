import org.jetbrains.kotlin.gradle.plugin.KonanArtifactContainer

apply {
    plugin("konan")
}

configure<KonanArtifactContainer> {

    library("kactoos-native") {
        enableMultiplatform(true)
    }

    program("kactoos-native-test") {
        srcDir("src/test/kotlin")
        commonSourceSets("test")
        libraries {
            artifact("kactoos-native")
        }
        extraOpts("-tr")
    }
}

dependencies {
    "expectedBy"(project(":kactoos-common"))
}

tasks {
    "test"(Task::class) {
        dependsOn("run")
    }
}
