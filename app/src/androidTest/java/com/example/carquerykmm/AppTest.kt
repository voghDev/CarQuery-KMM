package com.example.carquerykmm

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.carquerykmm.shared.App
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class AppTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun app_displaysGreeting() {
        composeTestRule.setContent {
            App()
        }

        // Verify "Hello World!" text is displayed
        composeTestRule.onNodeWithText("Hello World!")
            .assertIsDisplayed()

        // Verify platform-specific greeting is displayed
        // Android greeting format: "Hello, Android {SDK_VERSION}!"
        composeTestRule.onNodeWithText("Hello, Android", substring = true)
            .assertIsDisplayed()
    }
}
