plugins {
    id("me.lulu.bungeepractice.commons")
    id("java-library")
    kotlin("jvm")
    id("com.github.johnrengelman.shadow")
    `java-test-fixtures`
}

repositories {
    mavenCentral()
    gradlePluginPortal()
    google()
    maven("https://repo.imanity.dev/imanity-libraries")
    maven("https://repo.codemc.io/repository/maven-releases/")
    maven("https://repo.codemc.io/repository/maven-public/")


    maven {
        name = "lunarclient"
        url = uri("https://repo.lunarclient.dev")
    }

    maven {
        name = "placeholderapi"
        url = uri("https://repo.extendedclip.com/content/repositories/placeholderapi/")
    }
}

dependencies {
    compileOnlyApi("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    compileOnly("org.spigotmc:spigot-api")
}

tasks.withType<Test> {
    jvmArgs = listOf("-XX:+StartAttachListener")
    useJUnitPlatform()
}
