plugins {
    id("me.lulu.bungeepractice.spigot-plugin")
    id("io.fairyproject")
    id("io.spring.dependency-management")
}

dependencies {
    compileOnlyApi("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    compileOnlyApi("io.fairyproject:bukkit-bundles")
}