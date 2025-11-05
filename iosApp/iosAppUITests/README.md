# iOS UI Tests Setup

This directory contains UI tests for the iOS app. To use these tests, you need to add them to your Xcode project.

## Setup Instructions

1. Open `iosApp.xcodeproj` in Xcode
2. In the Project Navigator, right-click on the `iosApp` project (top level) and select "Add Files to iosApp..."
3. Navigate to the `iosAppUITests` folder and select it
4. Make sure "Create groups" is selected and click "Add"
5. Click on the `iosApp` project in the Project Navigator
6. Click the "+" button at the bottom of the targets list
7. Select "iOS" → "UI Testing Bundle" and click "Next"
8. Name it `iosAppUITests` and set the Target to be Tested to `iosApp`
9. Click "Finish"
10. Delete the default test file that Xcode creates
11. In the Project Navigator, select the `iosAppUITests` group you added earlier
12. In the File Inspector (right panel), under "Target Membership", check the box next to `iosAppUITests`

## Running the Tests

### Via Xcode:
1. Select the `iosAppUITests` scheme from the scheme selector
2. Press `Cmd + U` to run all tests
3. Or click the diamond icon next to individual test methods to run them

### Via Command Line:
```bash
xcodebuild test -project iosApp.xcodeproj -scheme iosApp -destination 'platform=iOS Simulator,name=iPhone 15'
```

## Test Coverage

- `testGreetingIsDisplayed()`: Verifies that the app displays "Hello World!" and the iOS-specific greeting
- `testLaunchPerformance()`: Measures app launch performance
