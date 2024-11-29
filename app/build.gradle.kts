plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.google.services) // Firebase
}

android {
    namespace = "com.example.projetmobile"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.projetmobile"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }



    buildFeatures {
        viewBinding = true // Enable view binding if required for easier layout handling
    }
}

dependencies {
    // Core dependencies
//    implementation(libs.camera.core)
//    implementation(libs.camera.lifecycle)
//    implementation(libs.camera.view)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.gridlayout)




        //implementation(libs.camera.core)
        implementation(libs.camera.camera2)
        //implementation(libs.camera.lifecycle)
        //implementation(libs.camera.view)

    // Networking
    implementation(libs.retrofit)
    implementation(libs.retrofit.gson)

    // Firebase
    implementation(libs.firebase.auth)
    implementation(libs.firestore)

    // ML Kit Barcode Scanning
    implementation(libs.mlkit.barcode.scanning)




    // Image loading
    implementation(libs.glide)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    implementation(libs.camera.view)
    implementation(libs.camera.lifecycle)
    annotationProcessor(libs.glide.compiler)



    // Testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}
