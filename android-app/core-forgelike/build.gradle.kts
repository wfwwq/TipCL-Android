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
    implementation(libs.kotlinx.serialization.json)

    testImplementation(kotlin("test"))
    testImplementation(libs.kotlinx.serialization.json)
}

tasks.test {
    useJUnitPlatform {
        // 网络实测用例仅通过 networkTest 手动触发
        excludeTags("network")
    }
}

tasks.register<Test>("networkTest") {
    group = "verification"
    description = "对真实 Forge installer install_profile 的联网实测（@Tag network）"
    useJUnitPlatform {
        includeTags("network")
    }
    testClassesDirs = sourceSets["test"].output.classesDirs
    classpath = sourceSets["test"].runtimeClasspath
}
