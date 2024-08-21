package com.example.induction

import SignInScreen
import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.compose.material3.Scaffold
import com.example.induction.ui.theme.AquaBlue
import com.example.induction.ui.theme.ButtonBlue
import com.example.induction.ui.theme.DeepBlue
import com.example.induction.ui.theme.TextWhite
import com.example.induction.ui.theme.customDesign.BottomMenuContents
import com.example.induction.ui.theme.customDesign.BottomNavigationMenu
import com.example.induction.ui.theme.lightblue
import com.example.induction.ui.theme.screens.GetStartedScreen
import com.example.induction.ui.theme.screens.ProfileScreen
import com.example.induction.ui.theme.screens.SettingsScreen
import com.example.induction.ui.theme.screens.home.HomeScreen

class MainActivity : ComponentActivity() {

    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavigationGraph()
        }
    }
}


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun NavigationGraph() {
    val navController = rememberNavController()
    val bottomMenuItems = listOf(
        BottomMenuContents("Profile", R.drawable.baseline_home_filled_24),
        BottomMenuContents("Home", R.drawable.baseline_home_filled_24),
        BottomMenuContents("Settings", R.drawable.baseline_home_filled_24)
    )

    Scaffold(
        bottomBar = {
            BottomNavigationMenu(
                items = bottomMenuItems,
                navController = navController
            )
        }
    ) {
        NavHost(
            navController = navController,
            startDestination = "home",
            modifier = Modifier.fillMaxSize()  // Removed innerPadding and replaced with fillMaxSize
        ) {
            composable("getstarted") { GetStartedScreen(navController) }
            composable("signin") { SignInScreen(navController) }
            composable("home") { HomeScreen(navController) }
            composable("profile") { ProfileScreen(navController) }
            composable("settings") { SettingsScreen(navController) }
        }
    }
}

fun NavController.navigateAndClearStack(route: String) {
    this.navigate(route) {
        popUpTo(this@navigateAndClearStack.graph.startDestinationId) {
            inclusive = true
        }
        launchSingleTop = true
        restoreState = true
    }
}


