plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.serialization)
}

group = "com.tipcl.android"
version = "0.1.0"

kotlin {
    jvmToolchain(17)
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.3")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")

    testImplementation(kotlin("test"))
    testImplementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.3")
}

tasks.test {
    useJUnitPlatform {
        // 网络实测用例仅通过 networkTest 手动触发
        excludeTags("network")
    }
}

tasks.register<Test>("networkTest") {
    group = "verification"
    description = "对 Mojang/Fabric/BMCLAPI 真实源的手动联网实测（@Tag network）"
    useJUnitPlatform {
        includeTags("network")
    }
    testClassesDirs = sourceSets["test"].output.classesDirs
    classpath = sourceSets["test"].runtimeClasspath
}
