plugins {
    id("java-platform")
}

group = "me.lulu.bungeepractice.platform"

// allow the definition of dependencies to other platforms like the Spring Boot BOM
javaPlatform.allowDependencies()

dependencies {
    constraints {
        api("org.apache.juneau:juneau-marshall:8.2.0")
        api("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
        api("xyz.xenondevs:particle:1.8.4")
        api("org.mongodb:mongodb-driver-sync:4.7.1")
        api("org.jetbrains:annotations:23.0.0")
        api("com.lunarclient:apollo-api:1.1.0")
        api("me.clip:placeholderapi:2.11.5")
        api("com.github.shynixn.mccoroutine:mccoroutine-bukkit-api:2.15.0")
        api("com.github.shynixn.mccoroutine:mccoroutine-bukkit-core:2.15.0")
        api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.1")
        api("org.spigotmc:spigot-api:1.8.8-R0.1-SNAPSHOT")
    }
}
