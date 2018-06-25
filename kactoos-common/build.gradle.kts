plugins {
    id("kotlin-platform-common")
}

dependencies {
    compile(kotlin("stdlib-common"))
    compile(`atomicfu-common`())
    compile(`coroutines-common`())
    testCompile(kotlin("test-common"))
    testCompile(kotlin("test-annotations-common"))
}
