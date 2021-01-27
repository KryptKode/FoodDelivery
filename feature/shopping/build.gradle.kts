plugins {
    androidLibrary
    kotlinKapt
}

dependencies {
    implementation(project(BuildModules.Common.androidShared))
    implementation(project(BuildModules.core))

    implementation(Libs.kotlinx_coroutines_android)
    implementation(Libs.kotlinx_coroutines_core)

    implementation(Libs.javax_inject)

    implementation(Libs.core_ktx)
    implementation(Libs.appcompat)
    implementation(Libs.vectordrawable)
    implementation(Libs.swiperefreshlayout)

    implementation(Libs.material)
    implementation(Libs.constraintlayout)

    implementation(Libs.circleimageview)
    implementation(Libs.pageindicatorview)
    implementation(Libs.viewpager2)

    implementation(Libs.library)
    implementation(Libs.utils_v4)

    implementation(Libs.moshi_kotlin)
    kapt(Libs.moshi_kotlin_codegen)

    implementation(Libs.rxandroid)
    implementation(Libs.rxkotlin)
    implementation(Libs.mvrx)

    implementation(Libs.fragment_ktx)
    implementation(Libs.timber)

    implementation(Libs.paging_runtime_ktx)

    implementation(Libs.glide)
    kapt(Libs.com_github_bumptech_glide_compiler)

    implementation(Libs.lifecycle_extensions)
    implementation(Libs.lifecycle_livedata_ktx)
    implementation(Libs.lifecycle_viewmodel_ktx)
    implementation(Libs.lifecycle_runtime_ktx)
    implementation(Libs.lifecycle_common_java8)

    implementation (Libs.koin_android)
    implementation (Libs.koin_androidx_scope)
    implementation (Libs.koin_androidx_viewmodel)

    androidTestImplementation(Libs.androidx_test_ext_junit)
    androidTestImplementation(Libs.espresso_core)

    testImplementation(project(BuildModules.Common.testShared))
    testImplementation(Libs.junit_junit)
    testImplementation(Libs.core_testing)
    testImplementation(Libs.kotlinx_coroutines_test)
    testImplementation(Libs.truth)
    testImplementation(Libs.turbine)
}
