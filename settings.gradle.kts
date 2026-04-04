pluginManagement {
    repositories {
        maven("https://maven.fabricmc.net/") { name = "Fabric" }
        mavenCentral()
        gradlePluginPortal()
    }
    plugins {
        id("fabric-loom") version(providers.gradleProperty("loom_version").get())
        // Must match the Kotlin version bundled in fabric_kotlin_version above.
        // Loom 1.14's kotlinx-metadata-jvm tops out at metadata version 2.1.0,
        // so using Kotlin 2.2+ here will cause "cannot write metadata for future
        // compiler versions" at remap time.
        kotlin("jvm") version "2.1.10"
    }
}