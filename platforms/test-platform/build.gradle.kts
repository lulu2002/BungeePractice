plugins {
    id("java-platform")
}

group = "me.lulu.bungeepractice.platform"

// allow the definition of dependencies to other platforms like the JUnit 5 BOM
javaPlatform.allowDependencies()

dependencies {
    api(platform("org.junit:junit-bom:5.7.1"))

    constraints {
        api("de.flapdoodle.embed:de.flapdoodle.embed.mongo:3.5.2")
        api("io.mockk:mockk:1.13.3")
        api("dev.imanity.mockbukkit:MockBukkit1.8:1.0.31")
        api("com.github.shynixn.mccoroutine:mccoroutine-bukkit-test:2.15.0")
    }

}
