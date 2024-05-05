plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(platform("me.lulu.bungeepractice.platform:plugins-platform"))
    implementation(project(":commons"))
}
