fun properties(key: String) = project.findProperty(key).toString()

plugins {
    // Java support
    id("java")
    // Kotlin support
    id("org.jetbrains.kotlin.jvm") version "1.8.22"
    // Gradle IntelliJ Plugin
    id("org.jetbrains.intellij") version "1.+"
}

tasks {
    buildSearchableOptions {
        enabled = false
    }
}

intellij {

    version.set(properties("platformVersion"))
    plugins.set(listOf("java", "gradle", "maven", "org.intellij.scala:2024.1.25"))
}

dependencies {
    implementation(project(":mirrord-core"))
}
