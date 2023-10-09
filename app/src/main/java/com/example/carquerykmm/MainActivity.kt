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
                        DeepLinkButton("login") { launchDeepLink("domestika://login") }
                        DeepLinkButton("downloads") { launchDeepLink("domestika://downloads") }
                        DeepLinkButton("mycourses") { launchDeepLink("domestika://mycourses") }
                        DeepLinkButton("myprofile") { launchDeepLink("domestika://myprofile") }
                        DeepLinkButton("Courses orderBy popular 11") { launchDeepLink("domestika://courses?order=popular&filters=exclude_purchased&filterParams=11") }
                        DeepLinkButton("Courses orderBy popular") { launchDeepLink("domestika://courses?order=popular&filters=exclude_purchased") }
                        DeepLinkButton("Courses orderBy recent 11") { launchDeepLink("domestika://courses?order=recent&filters=exclude_purchased&filterParams=11") }
                        DeepLinkButton("Courses orderBy recent") { launchDeepLink("domestika://courses?order=recent&filters=exclude_purchased") }
                        DeepLinkButton("Courses orderBy bestseller 11") { launchDeepLink("domestika://courses?order=bestseller&filters=exclude_purchased&filterParams=11") }
                        DeepLinkButton("Courses orderBy bestseller") { launchDeepLink("domestika://courses?order=bestseller&filters=exclude_purchased") }
                        DeepLinkButton("Courses orderBy highestRated 11") { launchDeepLink("domestika://courses?order=highest_rated&filters=exclude_purchased&filterParams=11") }
                        DeepLinkButton("Courses orderBy highestRated") { launchDeepLink("domestika://courses?order=highest_rated&filters=exclude_purchased") }
                        DeepLinkButton("Courses 528") { launchDeepLink("domestika://courses/528") }
                        DeepLinkButton("search watercolor") { launchDeepLink("domestika://search/watercolor") }
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
