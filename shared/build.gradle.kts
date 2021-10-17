import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    kotlin("multiplatform")
    kotlin("native.cocoapods")
    id("kotlinx-serialization")
    id("com.google.gms.google-services")
    id("com.android.library")
}

version = "1.0"

kotlin {
    android()

    val iosTarget: (String, KotlinNativeTarget.() -> Unit) -> KotlinNativeTarget =
        if (System.getenv("SDK_NAME")?.startsWith("iphoneos") == true)
            ::iosArm64
        else
            ::iosX64

    iosTarget("ios") {}

    cocoapods {
        summary = "Some description for the Shared Module"
        homepage = "Link to the Shared Module homepage"
        ios.deploymentTarget = "14.1"
        frameworkName = "shared"
        podfile = project.file("../ToBuyList/Podfile")
    }
    
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(Kotlinx.datetime)
                implementation(Kotlinx.serializationJson)
                implementation(AndroidX.ktxCore)
//                implementation(AndroidX.ktxCollections)
//                implementation(AndroidX.ktxReactive)
//                implementation(AndroidX.ktxRoom)
                implementation(project.dependencies.platform(Firebase.bom))
                implementation(Firebase.realtimeDatabase)
                implementation(Firebase.authentication)

            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
        val androidMain by getting{
            dependencies{
                implementation(Kotlinx.coroutinesAndroid)
                implementation(Jake.timber)
            }
        }
        val androidTest by getting {
            dependencies {
                implementation(kotlin("test-junit"))
                implementation("junit:junit:4.13.2")
            }
        }
        val iosMain by getting{
            dependencies {
            }
        }
        val iosTest by getting
    }
}

android {
    compileSdkVersion(Versions.compileSdkVersion)
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdkVersion(Versions.minSdkVersion)
        targetSdkVersion(Versions.targetSdkVersion)
    }
}