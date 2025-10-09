# CarQuery
This project pretends to be a sample Android App to implement a client for CarQuery API

This Client will be implemented using

- Kotlin Multiplatform
- Jetpack compose
- Asynchronous code using [kotlinx.coroutines][14]
- error handling using [arrow-fx][2]
- Kotlin Code style & formatting check using [ktlint][3]

## Development Setup

This is a Kotlin Multiplatform project with support for **Android** and **iOS**.

### Prerequisites

- **For Android development:**
  - Android Studio (Arctic Fox or later)
  - JDK 17 or later

- **For iOS development:**
  - macOS with Xcode 14.1 or later
  - CocoaPods (optional, for dependency management)

### Opening the Project

#### Android Studio

1. Clone this repository:
   ```bash
   git clone <repository-url>
   cd CarQuery-KMM
   ```

2. Open Android Studio

3. Select **File → Open** and navigate to the project root directory

4. Wait for Gradle sync to complete

5. Select the `app` configuration from the run configurations dropdown

6. Click **Run** to build and run the Android app on an emulator or device

#### Xcode (iOS)

1. First, build the shared framework from the command line:
   ```bash
   cd CarQuery-KMM
   ./gradlew :shared:embedAndSignAppleFrameworkForXcode
   ```

2. Open Xcode

3. Select **File → Open** and navigate to:
   ```
   CarQuery-KMM/iosApp/iosApp.xcodeproj
   ```

4. Select a target device or simulator from the scheme selector

5. Click **Run** (▶) to build and run the iOS app

**Note:** The Xcode project is configured to automatically build the Kotlin framework as part of the build process.

Installing
----------

Clone this repository and edit `local.properties` files. Add your CarQuery Api Key like this

    carQueryApiKey=abc12345

where `abc12345` is your own ApiKey.

Icons
-----

All icons, were downloaded from [flaticon.com][4]

[1]: https://github.com/Kodein-Framework/Kodein-DI/
[2]: https://github.com/arrow-kt/arrow
[3]: https://github.com/shyiko/ktlint
[4]: http://www.flaticon.com
[14]: https://github.com/Kotlin/kotlinx.coroutines
[15]: https://github.com/voghDev/PlayBattlegrounds/pull/72
