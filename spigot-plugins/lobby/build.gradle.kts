plugins {
    id("me.lulu.bungeepractice.fairy-base")
    id("me.lulu.bungeepractice.plugin-using-fairy-core")
    id("me.lulu.bungeepractice.bukkit-test-base")
}

version = "0.0.1"

dependencies {
}

fairy {
    name.set("BungeePracticeLobby")
}

tasks {
    shadowJar {
        archiveFileName.set("BungeePracticeLobby-$version.jar")
    }
}