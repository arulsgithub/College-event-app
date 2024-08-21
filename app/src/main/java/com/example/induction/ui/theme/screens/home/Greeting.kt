package com.example.induction.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.induction.R
import com.example.induction.ui.theme.TextWhite

@Composable
fun Greeting(
    name: String = "Arul",
    subTitle: String = "",

) {
    val composition by rememberLottieComposition(
        spec = LottieCompositionSpec.RawRes(R.raw.female)
    )
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp, end = 10.dp)
    ) {

        LottieAnimation(
            composition = composition,
            modifier = Modifier.size(80.dp)
        )


        Column(
            verticalArrangement = Arrangement.Center

        ) {
            Text(
                text = "Welcome",
                color = Color.Gray,
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding()
            )
            Text(
                text = "Smrithi",
                color = Color.Black,
                style = MaterialTheme.typography.bodySmall
            )
        }
        Image(
            painter = painterResource(id = R.drawable.bell),
            contentDescription = null,
            modifier = Modifier
                .padding(start = 140.dp)
                .size(35.dp)
        )
    }
}
