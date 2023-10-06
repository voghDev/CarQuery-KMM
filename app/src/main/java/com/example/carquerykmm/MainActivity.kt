package com.example.carquerykmm

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.findNavController
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
                    Column(Modifier.fillMaxSize()) {
                        DeepLinkButton("My Courses DeepLink") { launchDeepLink("domestika://mycourses") }
                        DeepLinkButton("Course Landing DeepLink") { launchDeepLink("domestika://course") }
                        DeepLinkButton("Courses DeepLink") { launchDeepLink("domestika://courses/") }
                        DeepLinkButton("Profile DeepLink") { launchDeepLink("domestika://profile/") }
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
        onClick = { onClick() }) {
        Text(text = text)
    }
}
