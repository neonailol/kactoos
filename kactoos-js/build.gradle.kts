import com.liferay.gradle.plugins.node.tasks.ExecuteNodeScriptTask
import com.liferay.gradle.plugins.node.tasks.ExecuteNodeTask
import com.liferay.gradle.plugins.node.tasks.ExecuteNpmTask
import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile

plugins {
    id("kotlin-platform-js")
    id("com.liferay.node") version "4.4.0"
}

dependencies {
    expectedBy(project(":kactoos-common"))
    implementation(kotlin("stdlib-js"))
    implementation(`atomicfu-js`())
    implementation(`coroutines-js`())
    testCompile(kotlin("test-js"))
}

configurations {
    node {
        isDownload = true
        setNodeVersion("10.9.0")
    }
}

tasks {

    "compileKotlin2Js"(Kotlin2JsCompile::class) {
        kotlinOptions {
            moduleKind = "umd"
            sourceMap = true
            sourceMapEmbedSources = "always"
        }
    }

    "compileTestKotlin2Js"(Kotlin2JsCompile::class) {
        kotlinOptions {
            moduleKind = "umd"
            sourceMap = true
            sourceMapEmbedSources = "always"
        }
    }

    val populateNodeModules by creating(Copy::class) {
        dependsOn("compileKotlin2Js")
        val kotlin2JsCompile = tasks["compileKotlin2Js"] as Kotlin2JsCompile
        from(kotlin2JsCompile.destinationDir)
        configurations.testCompile.forEach {
            from(zipTree(it.absolutePath).matching { include("*.js") })
        }
        into("$buildDir/node_modules")
    }

    val installQunit by creating(ExecuteNpmTask::class) {
        inputs.property("qunitVersion", "2.6.2")
        outputs.dir(file("node_modules/qunit"))
        setArgs(listOf("install", "qunit@2.6.2"))
    }

    val runQunit by creating(ExecuteNodeScriptTask::class) {
        dependsOn("compileTestKotlin2Js", "populateNodeModules", "installQunit")
        setScriptFile(file("node_modules/qunit/bin/qunit"))
        val kotlin2JsCompile = tasks["compileTestKotlin2Js"] as Kotlin2JsCompile
        setArgs(listOf(projectDir.toPath().relativize(file(kotlin2JsCompile.outputFile).toPath())))
    }

    "test"(Task::class) {
        dependsOn("runQunit")
    }
}
