plugins {
    id("java")
    id("kotlin")
    id("maven")
}

dependencies {
    testCompile(project(":kactoos-jvm"))
    testCompile(kotlin("stdlib-jdk8"))
    testCompile(kotlin("reflect"))
    testCompile(kotlin("test-testng"))
    testCompile("org.cactoos:cactoos:0.29")
    testCompile("org.reflections:reflections:0.9.11")
    testCompile("org.testng:testng:6.14.3")
    testCompile("org.assertj:assertj-core:3.9.1")
}

tasks {
    "test"(Test::class) {
        useTestNG()
    }
}
