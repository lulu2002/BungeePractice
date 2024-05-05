plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(platform("me.lulu.bungeepractice.platform:plugins-platform"))
    implementation(project(":commons"))
    implementation("org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin")
}
