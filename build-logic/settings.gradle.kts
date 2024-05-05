dependencyResolutionManagement {
    repositories {
        gradlePluginPortal()
        google()
        maven("https://repo.imanity.dev/imanity-libraries")
    }
}
includeBuild("../platforms")

rootProject.name = "build-logic"
include("commons")
include("spigot-plugin")
include("kotlin-library")
include("test-fixture-base")
