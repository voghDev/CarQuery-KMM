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
                        val scheme = BuildConfig.Scheme
                        DeepLinkButton("login") { launchDeepLink("$scheme://login") }
                        DeepLinkButton("apps") { launchDeepLink("$scheme://apps") }
                        DeepLinkButton("downloads") { launchDeepLink("$scheme://downloads") }
                        DeepLinkButton("mycourses") { launchDeepLink("$scheme://mycourses") }
                        DeepLinkButton("myprofile") { launchDeepLink("$scheme://myprofile") }
                        DeepLinkButton("mysettings") { launchDeepLink("$scheme://mysettings") }
                        DeepLinkButton("Courses orderBy popular basics categ 11") { launchDeepLink("$scheme://courses?order=popular&filters=basics-category&filterParams=11") }
                        DeepLinkButton("Courses orderBy popular basics") { launchDeepLink("$scheme://courses?order=popular&filters=basics") }
                        DeepLinkButton("Courses orderBy recent area 102") { launchDeepLink("$scheme://courses?order=recent&filters=basics-area&filterParams=102") }
                        DeepLinkButton("Courses orderBy recent") { launchDeepLink("$scheme://courses?order=recent&filters=basics") }
                        DeepLinkButton("2 Courses categ 11") { launchDeepLink("$scheme://courses?filters=category&filterParams=11") }
                        DeepLinkButton("Courses orderBy bestseller basics") { launchDeepLink("$scheme://courses?order=bestseller&filters=basics") }
                        DeepLinkButton("Courses orderBy bestseller basics area 102") { launchDeepLink("$scheme://courses?order=bestseller&filters=basics-area&filterParams=102") }
                        DeepLinkButton("Courses orderBy highestRated categ 11") { launchDeepLink("$scheme://courses?order=highest_rated&filters=category&filterParams=11") }
                        DeepLinkButton("Courses orderBy highestRated area 102") { launchDeepLink("$scheme://courses?order=highest_rated&filters=area&filterParams=102") }
                        DeepLinkButton("Courses orderBy highestRated") { launchDeepLink("$scheme://courses?order=highest_rated&filters=basics") }
                        DeepLinkButton("Courses orderBy price - basics") { launchDeepLink("$scheme://courses?order=price&filters=basics") }
                        DeepLinkButton("Courses 528") { launchDeepLink("$scheme://courses/528") }
                        DeepLinkButton("Courses") { launchDeepLink("$scheme://courses") }
                        DeepLinkButton("search watercolor") { launchDeepLink("$scheme://search/watercolor") }
                        DeepLinkButton("SignUp DeepLink") { launchDeepLink("$scheme://signup") }
                        DeepLinkButton("ResetPassword DeepLink") { launchDeepLink("$scheme://auth/password/edit") }
                        DeepLinkButton("Search DeepLink") { launchDeepLink("$scheme://search") }
                        DeepLinkButton("Topic DeepLink") { launchDeepLink("$scheme://topic") }
                        DeepLinkButton("Launch DeepLink") { launchDeepLink("$scheme://launch/") }
                        DeepLinkButton("Topic Detail DeepLink") { launchDeepLink("$scheme://topic/12") }
                        DeepLinkButton("Project Detail DeepLink") { launchDeepLink("$scheme://project/1666844") }
                        DeepLinkButton("1 courses basics"){ launchDeepLink("$scheme://courses?filters=basics")}
                        DeepLinkButton("courses category 11"){ launchDeepLink("$scheme://courses?filters=category&filterParams=11")}
                        DeepLinkButton("3 courses area 102"){ launchDeepLink("$scheme://courses?filters=area&filterParams=102")}
                        DeepLinkButton("courses highest_rated basics"){ launchDeepLink("$scheme://courses?order=highest_rated&filters=basics")}
                        DeepLinkButton("courses highest_rated category 11"){ launchDeepLink("$scheme://courses?order=highest_rated&filters=category&filterParams=11")}
                        DeepLinkButton("courses bestseller area 102"){ launchDeepLink("$scheme://courses?order=bestseller&filters=area&filterParams=102")}
                        DeepLinkButton("4 courses bestseller"){ launchDeepLink("$scheme://courses?order=bestseller")}
                        DeepLinkButton("Lesson") { launchDeepLink("$scheme://courses/4855/units/16672/lessons/53071")}
                        DeepLinkButton("Discover Recommended") { launchDeepLink("$scheme://discover/recommended")}
                        DeepLinkButton("Discover others are watching") { launchDeepLink("$scheme://discover/otherswatching")}
                        DeepLinkButton("Discover new plus courses") { launchDeepLink("$scheme://discover/newpluscourses")}
                        DeepLinkButton("Wishlists") { launchDeepLink("$scheme://wishlists")}
                        DeepLinkButton("MyCourses recommended") { launchDeepLink("$scheme://mycourses/recommended")}
                        DeepLinkButton("Plus credits") { launchDeepLink("$scheme://pluscredits")}
                        DeepLinkButton("Purchase plus credits") { launchDeepLink("$scheme://purchasepluscredits")}
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
