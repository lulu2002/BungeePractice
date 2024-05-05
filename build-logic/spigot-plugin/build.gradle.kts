plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(platform("me.lulu.bungeepractice.platform:plugins-platform"))
    implementation(project(":commons"))
    implementation(project(":test-fixture-base"))

    implementation("io.fairyproject:io.fairyproject.gradle.plugin")
    implementation("io.spring.gradle:dependency-management-plugin")
    implementation("org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin")
    implementation("com.github.johnrengelman:shadow")
}
