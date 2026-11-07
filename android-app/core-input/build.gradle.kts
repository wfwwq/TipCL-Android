plugins {
    id("com.android.library")
    kotlin("android")
}

group = "com.tipcl.android"
version = "0.1.0"

android {
    namespace = "com.tipcl.android.core.input"
    compileSdk = 35

    defaultConfig {
        minSdk = 26
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
}
