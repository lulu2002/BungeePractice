plugins {
    id("me.lulu.bungeepractice.commons")
    `java-test-fixtures`
}

dependencies {
    testFixturesApi(platform("me.lulu.bungeepractice.platform:test-platform"))
    testFixturesApi("org.junit.jupiter:junit-jupiter")
    testFixturesApi("io.mockk:mockk")
}
