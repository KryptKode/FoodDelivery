import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

/**
 * Generated by https://github.com/jmfayard/buildSrcVersions
 *
 * Find which updates are available by running
 *     `$ ./gradlew buildSrcVersions`
 * This will only update the comments.
 *
 * YOU are responsible for updating manually the dependency version.
 */
object Versions {
    const val org_jetbrains_kotlinx_kotlinx_coroutines: String = "1.4.2"

    const val com_github_bumptech_glide: String = "4.11.0"

    const val androidx_test_espresso: String = "3.3.0"

    const val com_squareup_retrofit2: String = "2.9.0"

    const val com_squareup_okhttp3: String = "4.9.0"

    const val androidx_navigation: String = "2.3.2"

    const val androidx_lifecycle: String = "2.2.0"

    const val com_squareup_moshi: String = "1.11.0"

    const val androidx_paging: String = "3.0.0-alpha12"

    const val androidx_hilt: String = "1.0.0-alpha02"

    const val androidx_room: String = "2.3.0-alpha04"

    const val androidx_work: String = "2.4.0"

    const val io_mockk: String = "1.10.4" // available: "1.10.5"

    const val com_android_tools_build_gradle: String = "4.1.1" // available: "4.1.2"

    const val androidx_test_ext_junit: String = "1.1.2"

    const val androidx_test_runner: String = "1.3.1-alpha03"

    const val androidx_test_rules: String = "1.3.0"

    const val androidx_test_core: String = "1.3.0"

    const val junit_junit: String = "4.13.1"

    const val de_fayard_buildsrcversions_gradle_plugin: String = "0.7.0"

    const val kotlin_scripting_compiler_embeddable: String = "1.4.21" // available:"1.4.21-2"

    const val kotlin_annotation_processing_gradle: String = "1.4.21" // available: "1.4.21-2"

    const val hilt_android_gradle_plugin: String = "2.28.3-alpha"

    const val kotlin_parcelize_compiler: String = "1.4.21" // available: "1.4.21-2"

    const val kotlin_parcelize_runtime: String = "1.4.21" // available: "1.4.21-2"

    const val hilt_android_compiler: String = "2.30.1-alpha"

    const val kotlin_gradle_plugin: String = "1.4.21" // available: "1.4.21-2"

    const val leakcanary_android: String = "2.6"

    const val swiperefreshlayout: String = "1.2.0-alpha01"

    const val kotlin_test_junit: String = "1.4.21-2"

    const val pageindicatorview: String = "1.0.3"

    const val constraintlayout: String = "2.0.4"

    const val circleimageview: String = "3.1.0"

    const val vectordrawable: String = "1.1.0"

    const val kotlin_stdlib: String = "1.4.21-2"

    const val core_testing: String = "1.1.1"

    const val fragment_ktx: String = "1.2.5"

    const val hilt_android: String = "2.30.1-alpha"

    const val javax_inject: String = "1"

    const val lint_gradle: String = "27.1.1" // available: "27.1.2"

    const val robolectric: String = "4.4" // available: "4.5"

    const val viewbinding: String = "4.1.1" // available: "4.1.2"

    const val viewpager2: String = "1.0.0"

    const val appcompat: String = "1.2.0"

    const val rxandroid: String = "2.1.1"

    const val core_ktx: String = "1.3.2"

    const val material: String = "1.2.1"

    const val rxkotlin: String = "2.4.0"

    const val turbine: String = "0.3.0"

    const val ktlint: String = "0.38.1" // available: "0.40.0"

    const val timber: String = "4.7.1"

    const val aapt2: String = "4.1.1-6503028" // available: "4.1.2-6503028"

    const val truth: String = "1.1" // available: "1.1.2"

    const val mvrx: String = "2.0.0-beta3"

    /**
     * Current version: "6.5"
     * See issue 19: How to update Gradle itself?
     * https://github.com/jmfayard/buildSrcVersions/issues/19
     */
    const val gradleLatestVersion: String = "6.8.1"
}

/**
 * See issue #47: how to update buildSrcVersions itself
 * https://github.com/jmfayard/buildSrcVersions/issues/47
 */
val PluginDependenciesSpec.buildSrcVersions: PluginDependencySpec
    inline get() =
            id("de.fayard.buildSrcVersions").version(Versions.de_fayard_buildsrcversions_gradle_plugin)
