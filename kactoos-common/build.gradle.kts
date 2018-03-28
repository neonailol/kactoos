plugins {
    id("kotlin-platform-common")
}

dependencies {
    compile(kotlin("stdlib-common"))
    testCompile(kotlin("test-common"))
    testCompile(kotlin("test-annotations-common"))
}
