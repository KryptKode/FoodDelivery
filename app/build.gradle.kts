plugins {
    androidApplication
    kotlinAndroid
    kotlinParcelize
    kotlinKapt
    jacoco
}

android {
    compileSdkVersion(Config.compileSdk)

    defaultConfig {
        applicationId("com.kryptkode.android.module.template")
        minSdkVersion(Config.minSdk)
        targetSdkVersion(Config.targetSdk)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        buildTypes {
            getByName(BuildTypes.RELEASE) {
                isMinifyEnabled = true
            }
        }
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(project(BuildModules.core))
    implementation(project(BuildModules.Common.androidShared))
    implementation(project(BuildModules.Feature.shopping))

    implementation(Libs.kotlin_stdlib)
    implementation(Libs.core_ktx)
    implementation(Libs.appcompat)
    implementation(Libs.timber)

    implementation(Libs.moshi_kotlin)

    implementation(Libs.rxandroid)
    implementation(Libs.rxkotlin)
    implementation(Libs.mvrx)

    implementation(Libs.room_ktx)
    implementation(Libs.room_runtime)

    implementation(Libs.constraintlayout)
    implementation(Libs.material)

    implementation(Libs.navigation_fragment_ktx)
    implementation(Libs.navigation_ui_ktx)

    implementation (Libs.koin_android)
    implementation (Libs.koin_androidx_scope)
    implementation (Libs.koin_androidx_viewmodel)

    debugImplementation(Libs.leakcanary_android)

    implementation(Libs.dagger_android)
    kapt(Libs.dagger_compiler)

    testImplementation(Libs.junit_junit)
    androidTestImplementation(Libs.androidx_test_ext_junit)
    androidTestImplementation(Libs.espresso_core)
}
