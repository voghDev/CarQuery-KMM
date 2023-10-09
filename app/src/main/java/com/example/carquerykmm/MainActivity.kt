package com.example.carquerykmm

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.carquerykmm.ui.theme.CarQueryKMMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CarQueryKMMTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        Modifier
                            .fillMaxSize()
                            .verticalScroll(rememberScrollState())
                    ) {
                        DeepLinkButton("My Courses DeepLink") { launchDeepLink("domestika://mycourses") }
                        DeepLinkButton("Course Landing DeepLink") { launchDeepLink("domestika://course/4587") }
                        DeepLinkButton("Courses DeepLink") { launchDeepLink("domestika://courses/") }
                        DeepLinkButton("Profile DeepLink") { launchDeepLink("domestika://profile/") }
                        DeepLinkButton("ConfirmRegistration DeepLink") { launchDeepLink("domestika://apps") }
                        DeepLinkButton("Downloads DeepLink") { launchDeepLink("domestika://downloads") }
                        DeepLinkButton("Login DeepLink") { launchDeepLink("domestika://login") }
                        DeepLinkButton("My Settings DeepLink") { launchDeepLink("domestika://mysettings") }
                        DeepLinkButton("Project DeepLink") { launchDeepLink("domestika://project/12") }
                        DeepLinkButton("SignUp DeepLink") { launchDeepLink("domestika://signup") }
                        DeepLinkButton("ResetPassword DeepLink") { launchDeepLink("domestika://auth/password/edit") }
                        DeepLinkButton("Search DeepLink") { launchDeepLink("domestika://search") }
                        DeepLinkButton("Topic DeepLink") { launchDeepLink("domestika://topic/") }
                        DeepLinkButton("Topic Detail DeepLink") { launchDeepLink("domestika://topic/12") }
                    }
                }
            }
        }
    }

    private fun launchDeepLink(uri: String) {
        val deepLink = Uri.parse(uri)
        val intent = Intent(Intent.ACTION_VIEW, deepLink)

        startActivity(intent)
    }
}

@Composable
fun DeepLinkButton(text: String, onClick: () -> Unit) {
    Button(
        modifier = Modifier.wrapContentSize(),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF02D00)),
        onClick = { onClick() }
    ) {
        Text(text = text)
    }
}
