package com.example.induction.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.induction.R
import com.example.induction.ui.theme.TextWhite

@Composable
fun Greeting(
    name: String = "Arul",
    subTitle: String = "",
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp)
    ) {

        Image(
            painter = painterResource(id = R.drawable.user),
            contentDescription = null,
            modifier = Modifier
                .size(50.dp)
        )


        Column(
            verticalArrangement = Arrangement.Center

        ) {
            Text(
                text = "Welcome,\n $name",
                color = TextWhite,
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(start = 10.dp)
            )
            Text(
                text = subTitle,
                color = TextWhite,
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
