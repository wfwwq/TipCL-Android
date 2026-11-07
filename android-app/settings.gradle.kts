pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
        // 阿里云镜像 fallback（网络受限时取消注释并置于最前）：
        // maven("https://maven.aliyun.com/repository/google")
        // maven("https://maven.aliyun.com/repository/central")
        // maven("https://maven.aliyun.com/repository/gradle-plugin")
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        // 阿里云镜像 fallback：
        // maven("https://maven.aliyun.com/repository/google")
        // maven("https://maven.aliyun.com/repository/central")
    }
}

rootProject.name = "TipCL-Android"

include(":app")
include(":core-launch")
include(":core-runtime")
include(":core-input")
include(":core-ui")
include(":core-forgelike")
include(":core-audio")
