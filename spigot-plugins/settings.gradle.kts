pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
        maven("https://repo.imanity.dev/imanity-libraries")
    }
    includeBuild("../build-logic")
}


includeBuild("../platforms")

rootProject.name = "spigot-plugins"

include("lobby")
include("core")
