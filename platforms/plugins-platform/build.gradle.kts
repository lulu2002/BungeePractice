plugins {
    id("java-platform")
}

group = "me.lulu.bungeepractice.platform"

dependencies {
    constraints {
        api("org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin:1.9.10")
        api("org.jetbrains.kotlin:kotlin-allopen:1.9.10")

        api("io.fairyproject:io.fairyproject.gradle.plugin:0.7.0b8-SNAPSHOT")
        api("io.spring.gradle:dependency-management-plugin:1.1.4")
        api("com.github.johnrengelman:shadow:8.1.1")
    }
}