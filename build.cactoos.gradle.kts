plugins {
    base
    id("java")
    id("maven")
}

group = "org.cactoos"
version = "1.0-SNAPSHOT"
description = """cactoos"""

dependencies {
    "compile"("org.llorllale:cactoos-matchers:0.9.1")
    "compile"("org.takes:takes:1.11.3")
    "compile"("junit:junit:4.12") { exclude(module = "hamcrest-core") }
    "compile"("org.mockito:mockito-core:2.18.3") { exclude(module = "hamcrest-core") }
    "compile"("org.hamcrest:hamcrest-library:1.3")
    "compile"("org.hamcrest:hamcrest-core:1.3")
}

tasks {
    "test"(Test::class) {
        enabled = false
    }
}
