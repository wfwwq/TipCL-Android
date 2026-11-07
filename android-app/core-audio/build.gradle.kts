plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

group = "com.tipcl.android"
version = "0.1.0"

android {
    namespace = "com.tipcl.android.core.audio"
    compileSdk = 35
    ndkVersion = "27.2.12479018"

    defaultConfig {
        minSdk = 26

        externalNativeBuild {
            cmake {
                arguments += "-DANDROID_STL=none"
                abiFilters += listOf("arm64-v8a", "x86_64")
            }
        }
    }

    externalNativeBuild {
        cmake {
            path = file("src/main/cpp/CMakeLists.txt")
            version = "3.22.1"
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation(libs.junit)
}
