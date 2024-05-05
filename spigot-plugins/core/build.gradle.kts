plugins {
    id("me.lulu.bungeepractice.fairy-base")
    id("me.lulu.bungeepractice.bukkit-test-base")
}

fairy {
    mainPackage.set("me.lulu.bungeepractice.core")
    fairyPackage.set("me.lulu.bungeepractice.core.fairy")
    name.set("BungeePracticeServerCore")
}

version = "1.0.0"

dependencies {
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    api("io.fairyproject:bukkit-bundles")
    api("io.fairyproject:bukkit-command")
    api("io.fairyproject:bukkit-items")
    api("io.fairyproject:bukkit-menu")
    api("io.fairyproject:bukkit-storage")
    api("io.fairyproject:bukkit-timer")
    api("io.fairyproject:bukkit-xseries")
    api("io.fairyproject:module.actionbar")
    api("io.fairyproject:module.hologram")
    api("io.fairyproject:module.nametag")
    api("io.fairyproject:module.sidebar")

    api("io.fairyproject:bukkit-visibility")
    api("io.fairyproject:bukkit-visual")
    api("io.fairyproject:module.tablist")
    api("org.mongodb:mongodb-driver-sync")

    api("org.jetbrains.kotlinx:kotlinx-coroutines-core")
    api("com.github.shynixn.mccoroutine:mccoroutine-bukkit-api")
    api("com.github.shynixn.mccoroutine:mccoroutine-bukkit-core")

    compileOnlyApi("me.clip:placeholderapi")
    compileOnlyApi("com.lunarclient:apollo-api")

    implementation("com.github.cryptomorin:XSeries:version") { version { strictly("9.8.1") } }
    implementation("com.github.retrooper.packetevents:api") { version { strictly("2.1.0") } }
    implementation("com.github.retrooper.packetevents:netty-common") { version { strictly("2.1.0") } }
    implementation("com.github.retrooper.packetevents:spigot") { version { strictly("2.1.0") } }
}


tasks {
    val base = "me.lulu.bungeepractice.core"
    shadowJar {
        relocate("io.fairyproject", "${base}.fairy")
//        relocate("net.kyori", "${base}.fairy.libs.kyori")
        relocate("com.cryptomorin.xseries", "${base}.fairy.libs.xseries")
    }
}

runServer {
    version.set("1.8.8")
}
