plugins {
    id("kotlin-platform-common")
    id("org.jetbrains.kotlin.pill.PillConfigurablePlugin")
}

dependencies {
    compile(kotlin("stdlib-common"))
    compile(kotlin("test-common"))
    compile(kotlin("test-annotations-common"))
}
