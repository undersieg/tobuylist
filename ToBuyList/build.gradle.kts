plugins {
    id("com.android.application")
    id("dagger.hilt.android.plugin")
    id("androidx.navigation.safeargs")
    id("com.google.gms.google-services")
    kotlin("android")
    kotlin("kapt")
}

dependencies {
    implementation(project(":shared"))

    implementation(Google.material)
    implementation(AndroidX.appCompat)
    implementation(AndroidX.layout)
    implementation(AndroidX.navigationFragment)
    implementation(AndroidX.navigationUI)
//    implementation(AndroidX.navigationRuntime)
//    implementation(AndroidX.navigationSafeArgs)
    implementation(AndroidX.ktxCore)
//    implementation(AndroidX.ktxCollections)
//    implementation(AndroidX.ktxFragment)
    implementation(AndroidX.ktxLifecycle)
    implementation(AndroidX.ktxReactive)
    implementation(AndroidX.ktxViewModel)

    implementation(Hilt.navigation)

    kapt(Hilt.compiler)
    implementation(Hilt.android)
    implementation(Kotlinx.datetime)
    implementation(Kotlinx.coroutinesAndroid)

    implementation(Jake.timber)
}

android {
    compileSdkVersion(Versions.compileSdkVersion)
    defaultConfig {
        applicationId = "pl.aberidus.tobuylist"
        minSdkVersion(Versions.minSdkVersion)
        targetSdkVersion(Versions.targetSdkVersion)
        versionCode = Versions.versionCode
        versionName = Versions.versionName
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildFeatures {
        viewBinding = true
    }

    kotlinOptions {
        jvmTarget = "1.8"
        useIR = true
    }
}