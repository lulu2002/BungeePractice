import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    id("me.lulu.bungeepractice.fairy-base")
}

fairy {
    mainPackage.set(findProperty("plugin.package").toString())
    fairyPackage.set(findProperty("core.package").toString())

    bukkitProperties().apply {
        depends.add("BungeePracticeServerCore")
    }
}

dependencies {
    implementation("io.fairyproject:bukkit-bundles")

    compileOnly(project(":core"))
    testImplementation(project(":core"))

    testImplementation("com.github.cryptomorin:XSeries:version") { version { strictly("9.8.1") } }
    testImplementation("com.github.retrooper.packetevents:api") { version { strictly("2.1.0") } }
    testImplementation("com.github.retrooper.packetevents:netty-common") { version { strictly("2.1.0") } }
    testImplementation("com.github.retrooper.packetevents:spigot") { version { strictly("2.1.0") } }
}


tasks {

    shadowJar {
        relocate("io.fairyproject.bootstrap", "" + findProperty("plugin.package") + ".fairy.bootstrap")
        relocate("io.fairyproject", "" + findProperty("core.package") + ".fairy")
//        relocate("net.kyori", "" + findProperty("core.package") + ".fairy.libs.kyori")
        relocate("com.cryptomorin.xseries", "" + findProperty("core.package") + ".fairy.libs.xseries")
        relocate("org.spongepowered.configurate", "" + findProperty("plugin.package") + ".libs.configurate")

        relocate("me.lulu.bungeepractice.modules", "" + findProperty("plugin.package") + ".modules")

        dependencies {
            exclude(dependency("io.github.classgraph:.:."))
            exclude(dependency("io.github.toolfactory:.:."))
            exclude(dependency("javax.annotation:.:."))
            exclude(dependency("javax.persistence:.:."))
            exclude(dependency("com.google.code.gson:.:."))
            exclude(dependency("org.yaml:.:."))
            exclude(dependency("com.google.:.:."))
            exclude(dependency("org.jetbrains:.:."))
            exclude(dependency("net.kyori:.:."))
            exclude(dependency("com.github.retrooper.:.:."))
            exclude(dependency("io.fairyproject:.-platform:."))
        }

        archiveFileName.set(archiveFileName.get().split("-")[0] + ".jar")
    }
}


val copyCoreJar by tasks.registering(Copy::class) {
    from(project(":core").tasks.getByName<ShadowJar>("shadowJar"))
    into("server/work/plugins")
}

tasks {
    shadowJar {
        dependsOn(copyCoreJar)
    }
}

runServer {
    version.set("1.8.8")
}