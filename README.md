[![Actions Status](https://github.com/KryptKode/FoodDelivery/workflows/android/badge.svg)](https://github.com/KryptKode/DroidArch/actions)
[![codecov](https://codecov.io/gh/KryptKode/FoodDelivery/branch/master/graph/badge.svg?token=x88m6FvsHP)](https://codecov.io/gh/KryptKode/FoodDelivery)
[![Kotlin Version](https://img.shields.io/badge/kotlin-1.4.21-blue.svg)](http://kotlinlang.org/)
[![AGP](https://img.shields.io/badge/AGP-4.1.0-blue)](https://developer.android.com/studio/releases/gradle-plugin)
[![Gradle](https://img.shields.io/badge/Gradle-6.5-blue)](https://gradle.org)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0)

# Food Delivery

A simple android application that demonstrates [Mavericks (MvRx)](https://github.com/airbnb/MvRx) architecture with feature modules.

## Outline

- App Walk-through
- App Installation
- Building source
- Top Features
- Architecture
- Testing
- Libraries
- Extras

## App Walkthrough

The app is based on [this](https://dribbble.com/shots/6571883-Food-Delivery-App/attachments/6571883-Food-Delivery-App?mode=media) design by [Dmitriy Kazarov](https://dribbble.com/kazarov). 

<h4 align="center">
<img alt="Light mode screenshot" src="https://user-images.githubusercontent.com/25648077/105929823-b6758900-6048-11eb-919a-95bca4eef229.gif" width="35%" vspace="10" hspace="10">
Light mode
<img alt="Dark mode screenshot" src="https://user-images.githubusercontent.com/25648077/105929838-bd040080-6048-11eb-9874-262e8fd7d852.gif" width="35%" vspace="10" hspace="10">
 Dark mode 
<br>


## App Installation

You can download the APK from [releases](https://github.com/KryptKode/DroidArch/releases).

## Building Source

To build this project, you require:

- Android Studio 4.1.0  or higher
- Gradle 6.5 or higher

## Top features

- Multi-module [clean architecture](https://www.notion.so/Farmz-822ad4a6a3b0476cae93be909c39a2b2)
- [RxJava](https://github.com/ReactiveX/RxJava)
- Dependency injection with [Koin](https://insert-koin.io/)
- API request with [Retrofit](http://square.github.io/retrofit) and [Moshi](https://github.com/square/moshi) for JSON serialisation
- Local persistence with [Room](https://developer.android.com/topic/libraries/architecture/room)
- CI  with [Github actions](https://github.com/features/actions)
- Code coverage with [jacoco](https://github.com/vanniktech/gradle-android-junit-jacoco-plugin) with reports uploaded to [codecov](https://codecov.io/gh/KryptKode/DroidArch/)
- Code lint check with [Ktlint](https://github.com/pinterest/ktlint) using a [gradle plugin](https://github.com/JLLeitschuh/ktlint-gradle)
- Static code analysis with [detekt](https://github.com/detekt/detekt)
- Dependency management with [buildSrc](https://gradle.org/kotlin/)  (Kotlin DSL)
- Dependency updates with [buildSrcVersions](https://jmfayard.github.io/refreshVersions/)
- [Git hooks](https://github.com/KryptKode/FoodDelivery/tree/master/scripts/git-hooks) [](https://github.com/KryptKode/DroidArch/tree/master/scripts/git-hooks)to perform ktlint, detekt and lint checks before committing

## Architecture

The application follows the clean architecture concept. As software architecture involves the design decisions that are hard to change, we should take an approach that does not result in coupling of the various components of the software. This makes it easy to make changes as it scales. The presentation layer for each feature uses an [MvRx](https://github.com/airbnb/MvRx) architecture. With this in mind, the project is organised into modules as follows:

![Architecture](https://user-images.githubusercontent.com/25648077/105930387-dfe2e480-6049-11eb-8062-52837cf456b6.png)

### feature modules

This module contains features supported by the application. At present, only the `shopping` feature is implemented. Other features can be added as modules as the project scales. 

The shopping feature has two screens. One that shows a list of food. The user can scroll through the list and add an item to their cart. The other for displaying the user cart information. The module defines both the view and presentation for the feature. The presentation is implemented using `[MavericksViewModel](https://github.com/airbnb/MvRx/blob/master/mvrx/src/main/kotlin/com/airbnb/mvrx/MavericksViewModel.kt)` + `Fragment` combination with an MVRx architecture

### core module

The core module just sets up the implementation of the `data` layer of the application. It provides the `remote` and `cache` layers. Concurrency in the application is implemented using [RxJava](https://github.com/ReactiveX/RxJava) and this module provides the implementation for the schedulers used in the application. The networking layer is mocked using hardcoded JSON data in the assets directory

### common-android module

This module contains utility classes, extension functions, custom views shared by the android related modules. Most of the android modules depend on this module. Having the common classes here prevents duplication of code. 

### testShared module

This module contains classes shared in unit tests in all modules. 

### app module

This module connects all other modules. Provides navigation implementation with the [Navigation Architecture Component](https://developer.android.com/guide/navigation/navigation-getting-started) library. 

## Testing

Testing is done with Junit4 testing framework, and with Google Truth for making assertions. [Mockk](https://github.com/mockk/mockk) is used to provide mocks in some of the tests. The tests run on the CI and the code coverage report is generated by [jacoco](https://github.com/vanniktech/gradle-android-junit-jacoco-plugin) can be tracked [here](https://codecov.io/gh/KryptKode/FoodDelivery/).

## Libraries

- [Material Components](https://github.com/material-components/material-components-android/)
- [Constraint Layout](https://developer.android.com/reference/android/support/constraint/ConstraintLayout)
- [Retrofit](http://square.github.io/retrofit) for REST api communication
- [Moshi](https://github.com/square/moshi) for JSON serialisation and deserialisation
- [Mockk](https://github.com/mockk/mockk) for mocking in tests
- [Koin](https://insert-koin.io/) for dependency injection
- [RxJava](https://github.com/ReactiveX/RxJava) for concurrency
- [Navigation Architecture Component](https://developer.android.com/guide/navigation/navigation-getting-started)
- [Room](https://developer.android.com/topic/libraries/architecture/room) for database
- [Glide](https://github.com/bumptech/glide) for image loading
- [ViewBinding](https://developer.android.com/topic/libraries/view-binding)
- [Kotlin Delegates](https://kotlinlang.org/docs/reference/delegated-properties.html)
- [Ktlint gradle plugin](https://github.com/JLLeitschuh/ktlint-gradle) for code lint checks
- [Detekt](https://github.com/detekt/detekt) for static code analysis
- [LeakCanary](https://github.com/square/leakcanary) for detecting memory leaks in development

### Extras

The Gradle script uses Kotlin Gradle DSL ([buildSrc](https://gradle.org/kotlin/) ) which brings Kotlin's rich language features to Gradle configuration. The project also uses detect to detect code smells and ktlint to enforce proper code style. Github actions handle continuous integration and run detekt, ktlint, lint and unit tests concurrently.  A pre-commit git hook verifies the project's code style before committing code.  Test coverage reports are uploaded to [codecov](https://app.codecov.io/gh/KryptKode/FoodDelivery). 
