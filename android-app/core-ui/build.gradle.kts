plugins {
    id("com.android.library")
    kotlin("android")
    alias(libs.plugins.kotlin.compose)
}

group = "com.tipcl.android"
version = "0.1.0"

android {
    namespace = "com.tipcl.android.core.ui"
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

    buildFeatures {
        compose = true
    }
}

dependencies {
    api(project(":core-input"))

    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.material3)
    // 聊天输入条的系统返回键拦截（BackHandler）。
    implementation(libs.androidx.activity.compose)

    testImplementation(kotlin("test"))
    // 单测用真 org.json（android.jar 中的是抛异常 stub），供 OverlayLayoutJson 往返测试。
    testImplementation(libs.org.json)
}
