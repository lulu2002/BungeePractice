import org.gradle.kotlin.dsl.dependencies

plugins {
    id("me.lulu.bungeepractice.spigot-plugin")
    id("me.lulu.bungeepractice.test-fixture-base")
}

dependencies {
    testFixturesApi(platform("me.lulu.bungeepractice.platform:test-platform"))
    testFixturesApi(platform("me.lulu.bungeepractice.platform:product-platform"))

    testFixturesApi("dev.imanity.mockbukkit:MockBukkit1.8")
    testFixturesApi("org.spigotmc:spigot-api")
}
