plugins {
    id("com.android.application") version "8.3.1"
    id("org.jetbrains.kotlin.android") version "2.1.20"
}

repositories {
    google()
    mavenCentral()
}

android {
    namespace = "com.example.amojo"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.amojo"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
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
    testImplementation(libs.junit.jupiter)
}

tasks.withType<Test> {
    useJUnitPlatform()
}
