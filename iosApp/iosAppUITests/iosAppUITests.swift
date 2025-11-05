import XCTest

final class iosAppUITests: XCTestCase {

    override func setUpWithError() throws {
        continueAfterFailure = false
    }

    override func tearDownWithError() throws {
        // Put teardown code here. This method is called after the invocation of each test method in the class.
    }

    func testGreetingIsDisplayed() throws {
        // UI tests must launch the application that they test.
        let app = XCUIApplication()
        app.launch()

        // Verify "Hello World!" text is displayed
        let helloWorldText = app.staticTexts["Hello World!"]
        XCTAssertTrue(helloWorldText.waitForExistence(timeout: 5), "Hello World! text should be displayed")

        // Verify iOS-specific greeting is displayed
        // iOS greeting format: "Hello, iOS {version}!"
        let greetingPredicate = NSPredicate(format: "label CONTAINS[c] %@", "Hello, iOS")
        let iOSGreeting = app.staticTexts.containing(greetingPredicate).firstMatch
        XCTAssertTrue(iOSGreeting.waitForExistence(timeout: 5), "iOS greeting should be displayed")
    }

    func testLaunchPerformance() throws {
        if #available(macOS 10.15, iOS 13.0, tvOS 13.0, watchOS 7.0, *) {
            // This measures how long it takes to launch your application.
            measure(metrics: [XCTApplicationLaunchMetric()]) {
                XCUIApplication().launch()
            }
        }
    }
}
