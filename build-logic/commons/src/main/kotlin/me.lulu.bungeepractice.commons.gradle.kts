plugins {
    java
}

group = "me.lulu.bungeepractice"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}

dependencies {
    implementation(platform("me.lulu.bungeepractice.platform:product-platform"))

    testImplementation(platform("me.lulu.bungeepractice.platform:test-platform"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("io.mockk:mockk")

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
    useJUnitPlatform()
}