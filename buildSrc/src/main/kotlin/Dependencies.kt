
object Versions{
    const val compileSdkVersion = 30
    const val minSdkVersion = 26
    const val targetSdkVersion = 30
    const val versionCode = 1
    const val versionName = "1.0"

    const val androidMaterial = "1.4.0"
    const val androidService = "4.3.10"
    const val appCompat = "1.3.1"
    const val constraintLayout = "2.1.1"
    const val navigation = "2.3.5"
    const val gradleBuildTools = "4.2.2"
    const val hiltNavigation = "1.0.0"
    const val ktxCore = "1.6.0"
    const val ktxCollection = "1.1.0"
    const val ktxFragment = "1.3.6"
    const val ktxLifecycle = "2.4.0-alpha01"
    const val ktxRoom = "2.3.0"
    const val hilt = "2.39.1"
    const val junit4 = "4.13"
    const val kotlin = "1.5.31"
    const val kotlinxDatetime = "0.1.1"
    const val kotlinxSerialization = "1.1.0"
    const val kotlinxCoroutines = "1.5.2"

    const val firebaseBom = "28.4.2"

    const val jake = "5.0.1"
}

object AndroidX {
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val layout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val navigationSafeArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"
    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigationRuntime = "androidx.navigation:navigation-runtime-ktx:${Versions.navigation}"
    const val navigationUI = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    const val ktxCore = "androidx.core:core-ktx:${Versions.ktxCore}"
    const val ktxCollections = "androidx.collection:collection-ktx:${Versions.ktxCollection}"
    const val ktxFragment = "androidx.fragment:fragment-ktx:${Versions.ktxFragment}"
    const val ktxLifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.ktxLifecycle}"
    const val ktxReactive = "androidx.lifecycle:lifecycle-reactivestreams-ktx:${Versions.ktxLifecycle}"
    const val ktxViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.ktxLifecycle}"
    const val ktxRoom = "androidx.room:room-ktx:${Versions.ktxRoom}"
}

object Google {
    const val material = "com.google.android.material:material:${Versions.androidMaterial}"
    const val service = "com.google.gms:google-services:${Versions.androidService}"
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
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core::${Versions.kotlinxCoroutines}"
}

object Firebase {
    const val bom = "com.google.firebase:firebase-bom:${Versions.firebaseBom}"
    const val realtimeDatabase = "com.google.firebase:firebase-database-ktx"
    const val authentication = "com.google.firebase:firebase-auth-ktx"
}

object Jake {
    const val timber = "com.jakewharton.timber:timber:${Versions.jake}"
}









