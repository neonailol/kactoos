plugins {
    id("kotlin-platform-common")
}

dependencies {
    compile(kotlin("stdlib-common", "1.2.41"))
    testCompile(kotlin("test-common", "1.2.41"))
    testCompile(kotlin("test-annotations-common", "1.2.41"))
}
