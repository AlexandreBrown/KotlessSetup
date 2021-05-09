import io.kotless.plugin.gradle.dsl.kotless

plugins {
    kotlin("jvm")
    id("io.kotless") version "0.1.7-beta-5" apply true
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf()
        // GraalVM is only compatible with JVM 11
        jvmTarget = "11"
    }
}

dependencies {
    // GraalVM Runtime can be used only with Ktor DSL for now
    implementation("io.kotless", "ktor-lang", "0.1.7-beta-5")
}

kotless {
    config {
        bucket = "InsertBucketHere"

        terraform {
            profile = "InsertProfileHere"
            region = "ca-central-1"
        }
    }
    webapp {
        lambda {
            kotless {
                packages = setOf("insert.package.here")
            }
            runtime = io.kotless.resource.Lambda.Config.Runtime.GraalVM
        }
    }
}
