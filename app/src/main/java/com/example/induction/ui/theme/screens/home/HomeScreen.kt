package com.example.induction.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import com.example.induction.R


@Composable
fun HomeScreen(navController: NavController) {

    Box(modifier = Modifier.fillMaxSize()) {

        Image(
            painter = painterResource(id = R.drawable.bg),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .zIndex(-1f), // Ensure Image is below other content
            contentScale = ContentScale.Crop
        )

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Transparent) // Make sure LazyColumn is touchable
        ) {
            item {
                Column(
                    modifier = Modifier
                        .padding(top = 30.dp)
                ) {
                    Greeting()
                    ChipSection(chip = listOf("Chip1", "Chip2", "Chip3", "Chip4"))
                    Spacer(modifier = Modifier.height(15.dp))
                    Grids()
                }
            }
        }
    }
}
