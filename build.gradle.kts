plugins {
    kotlin("jvm") version "1.4.21" apply false
}

allprojects {
    group = "com.kotless.setup"
    version = "1.0"

    repositories{
        mavenCentral()
        jcenter()
    }
}
