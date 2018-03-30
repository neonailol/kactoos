plugins {
    base
    id("java")
    id("maven")
}

group = "org.cactoos"
version = "1.0-SNAPSHOT"
description = """cactoos"""

dependencies {
    "compile"("org.takes:takes:1.1")
    "compile"("junit:junit:4.12") { exclude(module = "hamcrest-core") }
    "compile"("org.mockito:mockito-core:2.10.0") { exclude(module = "hamcrest-core") }
    "compile"("org.hamcrest:hamcrest-library:1.3")
    "compile"("org.hamcrest:hamcrest-core:1.3")
}

tasks {
    "test"(Test::class) {
        enabled = false
    }
}
