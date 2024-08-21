package com.example.induction.ui.theme.screens

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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.induction.R
import com.example.induction.ui.theme.ButtonBlue
import com.example.induction.ui.theme.TextWhite

@Composable
fun GetStartedScreen(navController: NavController) {

    val gradientBrush = Brush.verticalGradient(
        colors = listOf(Color.Transparent, Color.Transparent, Color.Transparent, Color.Black.copy(alpha = 0.9f), Color.Black),
    )
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.ceg),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(brush = gradientBrush)
        ) {
            Text(
                text = "Ready to Explore?",
                style = MaterialTheme.typography.headlineSmall,
                color = TextWhite,
                modifier = Modifier
                    .padding(top = 540.dp)
            )
            Text(
                text = "Discover, Connect, and thrive into\nCampus life",
                style = MaterialTheme.typography.bodySmall,
                color = TextWhite.copy(alpha = 0.7f),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(10.dp))
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(height = 70.dp, width = 290.dp)
                    .padding(top = 10.dp)
                    .clip(RoundedCornerShape(15.dp))
                    .background(ButtonBlue)
                    .clickable {
                        navController.navigate("signin")
                    }
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Get Started",
                        style = MaterialTheme.typography.headlineSmall,
                        color = TextWhite,
                        modifier = Modifier.padding(10.dp)
                    )
                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(24.dp)
                    )
                }
            }
        }
    }
}
