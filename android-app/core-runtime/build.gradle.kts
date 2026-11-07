plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

group = "com.tipcl.android"
version = "0.1.0"

android {
    namespace = "com.tipcl.android.core.runtime"
    compileSdk = 35
    ndkVersion = "27.2.12479018"

    defaultConfig {
        minSdk = 26

        externalNativeBuild {
            cmake {
                cppFlags += ""
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

    defaultConfig {
        consumerProguardFiles("proguard-rules.pro")
    }

    packaging {
        jniLibs {
            useLegacyPackaging = false
        }
    }
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("junit:junit:4.13.2")
}

tasks.withType<Test>().configureEach {
    // JRE 供给端到端实测的持久缓存根（网络测试默认 Assume 跳过，
    // 设 TIPCL_NETTEST=1 执行；-Ptipcl.jre.cache.dir 覆盖缓存位置）
    systemProperty(
        "tipcl.jre.cache.dir",
        (findProperty("tipcl.jre.cache.dir") as String?)
            ?: layout.buildDirectory.dir("tmp/jre-e2e-cache").get().asFile.absolutePath,
    )
    // LWJGL 真实 natives jar 实测缓存根（网络测试默认 Assume 跳过，设 TIPCL_NETTEST=1 执行）
    systemProperty(
        "tipcl.lwjgl.cache.dir",
        (findProperty("tipcl.lwjgl.cache.dir") as String?) ?: rootDir.resolve("tools/lwjgl-cache").absolutePath,
    )
}
