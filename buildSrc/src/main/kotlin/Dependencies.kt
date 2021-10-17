
object Versions{
    const val compileSdkVersion = 29
    const val minSdkVersion = 24
    const val targetSdkVersion = 29
    const val versionCode = 1
    const val versionName = "1.0"

    const val androidMaterial = "1.4.0"
    const val appCompat = "1.3.1"
    const val constraintLayout = "2.1.1"
    const val gradleBuildTools = "4.2.2"
    const val hiltNavigation = "1.0.0"
    const val hilt = "2.39.1"
    const val junit4 = "4.13"
    const val kotlin = "1.5.31"
    const val kotlinxDatetime = "0.1.1"
    const val kotlinxSerialization = "1.1.0"
    const val kotlinxCoroutines = "1.3.2"
}

object AndroidX {
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val layout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
}

object Google {
    const val material = "com.google.android.material:material:${Versions.androidMaterial}"
}

object Gradle {
    const val tools = "com.android.tools.build:gradle:${Versions.gradleBuildTools}"
}

object Hilt {
    const val navigation = "androidx.hilt:hilt-navigation:${Versions.hiltNavigation}"
    const val compiler = "com.google.dagger:hilt-compiler:${Versions.hilt}"
    const val android = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val androidGradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"
}

object Junit {
    const val core = "junit:junit:${Versions.junit4}"
}

object Kotlin {
    const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val serialization = "org.jetbrains.kotlin:kotlin-serialization:${Versions.kotlin}"
}

object Kotlinx {
    const val datetime = "org.jetbrains.kotlinx:kotlinx-datetime:${Versions.kotlinxDatetime}"
    const val serializationJson = "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.kotlinxSerialization}"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlinxCoroutines}"
}









