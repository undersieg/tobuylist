buildscript {
    repositories {
        gradlePluginPortal()
        google()
        jcenter()
        mavenCentral()
    }
    dependencies {
        classpath(Kotlin.gradlePlugin)
        classpath(Kotlin.serialization)
        classpath(Gradle.tools)
        classpath(Google.service)
        classpath(Hilt.androidGradlePlugin)
        classpath(AndroidX.navigationSafeArgs)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}