package com.example.induction.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.induction.R
import com.example.induction.ui.theme.lightblue

@Composable
fun Grids(){
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(400.dp)
    ) {

        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(start = 10.dp, end = 10.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(height = 250.dp, width = 120.dp)
                    .clip(RoundedCornerShape(15.dp))
                    .background(lightblue)
            ){
                Image(
                    painter = painterResource(id = R.drawable.schedule),
                    contentDescription = null,
                    modifier = Modifier
                        .size(400.dp)
                        .padding(top = 100.dp),
                    contentScale = ContentScale.Crop
                )

                Text(
                    text = "Schedule",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.W900,
                    modifier = Modifier
                        .padding(start = 10.dp)
                )
                Text(
                    text = "View the induction schedule.",
                    style = MaterialTheme.typography.bodySmall,
                    fontWeight = FontWeight.Light,
                    modifier = Modifier
                        .padding(start = 10.dp, top = 20.dp,end = 50.dp)
                )


            }
            Column(
                verticalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(height = 125.dp, width = 220.dp)
                        .clip(RoundedCornerShape(15.dp))
                        .background(lightblue)
                ){
                    Image(
                        painter = painterResource(id = R.drawable.ceg_maps),
                        contentDescription = null,
                        modifier = Modifier
                            .size(450.dp)
                            .rotate(0f)
                            .padding(start = 30.dp),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = "CEG Maps",
                        style = MaterialTheme.typography.bodyLarge,
                        fontWeight = FontWeight.W900,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Text(
                        text = "View campus\n map.",
                        style = MaterialTheme.typography.bodySmall,
                        fontWeight = FontWeight.Light,
                        modifier = Modifier
                            .padding(start = 10.dp, top = 20.dp)
                    )


                }
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp),

                    ) {
                    Box(
                        modifier = Modifier
                            .size(height = 125.dp, width = 100.dp)
                            .clip(RoundedCornerShape(15.dp))
                            .background(lightblue)
                    ){

                        Column(
                            verticalArrangement = Arrangement.spacedBy(10.dp),
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(250.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(height = 125.dp, width = 220.dp)
                                    .clip(RoundedCornerShape(15.dp))
                                    .background(lightblue)
                            ) {
                                    Text(
                                        text = "FAQs",
                                        style = MaterialTheme.typography.bodyLarge,
                                        fontWeight = FontWeight.W900,
                                        modifier = Modifier
                                            .padding(start = 10.dp)
                                    )
                                    Text(
                                        text = "Clear your doubts.",
                                        style = MaterialTheme.typography.bodySmall,
                                        fontWeight = FontWeight.Light,
                                        modifier = Modifier
                                            .padding(start = 10.dp, top = 20.dp)
                                    )
                                Image(
                                    painter = painterResource(id = R.drawable.faq),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(500.dp)
                                        .padding(top = 50.dp, start = 30.dp)
                                )
                            }
                        }
                    }
                    Box(
                        modifier = Modifier
                            .size(height = 125.dp, width = 100.dp)
                            .clip(RoundedCornerShape(15.dp))
                            .background(lightblue)
                    ){

                            Text(
                                text = "Help",
                                style = MaterialTheme.typography.bodyLarge,
                                fontWeight = FontWeight.W900,
                                modifier = Modifier
                                    .padding(start = 10.dp)
                            )
                            Text(
                                text = "Stuck somewhere?",
                                style = MaterialTheme.typography.bodySmall,
                                fontWeight = FontWeight.Light,
                                modifier = Modifier
                                    .padding(start = 10.dp, top = 20.dp)
                            )
                        Image(
                            painter = painterResource(id = R.drawable.help),
                            contentDescription = null,
                            modifier = Modifier
                                .size(500.dp)
                                .padding(top = 50.dp, start = 30.dp)
                        )

                    }
                }
            }
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier
                .padding(start = 10.dp,end = 10.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(height = 120.dp, width = 200.dp)
                    .clip(RoundedCornerShape(15.dp))
                    .background(lightblue)
            ){
                Image(
                    painter = painterResource(id = R.drawable.ceg_places),
                    contentDescription = null,
                    modifier = Modifier
                        .size(height = 180.dp, width = 200.dp)
                        .padding(top = 30.dp),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = "CEG Places",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.W900,
                    modifier = Modifier
                        .padding(start = 10.dp)
                )
                Text(
                    text = "Explaore\n campus.",
                    style = MaterialTheme.typography.bodySmall,
                    fontWeight = FontWeight.Light,
                    modifier = Modifier
                        .padding(start = 10.dp,top = 20.dp)
                )
            }
            Box(
                modifier = Modifier
                    .size(height = 120.dp, width = 140.dp)
                    .clip(RoundedCornerShape(15.dp))
                    .background(lightblue)
            ){
                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = null,
                    modifier = Modifier
                        .size(400.dp)
                        .padding(start = 30.dp, top = 30.dp)
                        .rotate(330f),
                    contentScale = ContentScale.FillWidth
                )
                Text(
                    text = "Profile",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.W900,
                    modifier = Modifier
                        .padding(10.dp)
                )

            }
        }
    }
}
