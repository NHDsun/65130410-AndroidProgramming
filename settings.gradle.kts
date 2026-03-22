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
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "65130410-AndroidProgramming"
include(":app")
include(":bai1")
include(":bai2")
include(":bai3")
include(":bai4")
include(":bai5")
include(":bai6")
include(":bai7")
include(":bai1zalo")
include(":bai2zalo")
include(":bai3zalo")
