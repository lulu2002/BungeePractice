plugins {
    id("me.lulu.bungeepractice.commons")
    id("org.jetbrains.kotlin.jvm")
    id("java-library")
}

dependencies {
    implementation(kotlin("stdlib"))
}

fun DependencyHandlerScope.apiModule(any: Any) {
    add("api", any)
    testImplementation(testFixtures(any))
}
