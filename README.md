# KotlessSetup
Kotlin Serverless application template

# Setup after cloning
1. In the root build.gradle.kts, change `group = "com.kotless.setup"` to the package name of your project.
2. In the root settings.gradle.kts, change `rootProject.name = "KotlessSetup"` to the name you want to give this project.
3. In Infrastructure/build.gradle.kts, change `bucket = "InsertBucketHere"` to the desired Amazon S3 Bucket.
4. In Infrastructure/build.gradle.kts, change `profile = "InsertProfileHere"` to the desired IAM AWS profile name.
