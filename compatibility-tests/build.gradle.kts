
plugins {
    id("java")
    id("kotlin")
    id("maven")
}

dependencies {
    testCompile(project(":kactoos-jvm"))
    testCompile(project(":cactoos"))
    testCompile(kotlin("stdlib-jdk8"))
    testCompile(kotlin("reflect"))
    testCompile(kotlin("test-testng"))
    testCompile("org.reflections:reflections:0.9.11")
    testCompile(Deps.testng)
    testCompile("org.assertj:assertj-core:3.9.1")
    testCompile("org.assertj:assertj-core:3.9.1")
    testCompile("org.apache.commons:commons-lang3:3.7")
}

tasks {
    "test"(Test::class) {
        useTestNG()
    }
}
