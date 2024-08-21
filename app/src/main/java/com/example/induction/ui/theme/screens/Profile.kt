package com.example.induction.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.induction.R

@Composable
fun ProfileScreen(navController: NavController) {

    val composition by rememberLottieComposition(
        spec = LottieCompositionSpec.RawRes(R.raw.female)
    )

    Box(modifier = Modifier.fillMaxSize()) {

        Image(
            painter = painterResource(id = R.drawable.bg),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .zIndex(-1f),
            contentScale = ContentScale.Crop
        )

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Transparent)
        ) {
            item {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(200.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(start = 20.dp, end = 20.dp)
                        .padding(top = 50.dp)
                ) {
                    Text(
                        text = "Profile",
                        style = MaterialTheme.typography.headlineSmall,
                        fontWeight = FontWeight.W500
                    )
                    Image(
                        painter = painterResource(id = R.drawable.faq),
                        contentDescription = null,
                        modifier = Modifier.size(60.dp)
                    )
                }
                Spacer(modifier = Modifier.height(50.dp))

                Box(
                    modifier = Modifier
                        .wrapContentHeight()
                        .fillMaxWidth()
                        .padding(start = 30.dp, end = 30.dp)
                        .clip(RoundedCornerShape(10.dp))
                ) {

                    Column {

                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .wrapContentHeight()
                                .fillMaxWidth()

                                .background(Color(0xff46a8e9))

                        ) {
                            LottieAnimation(
                                composition = composition,
                                modifier = Modifier.size(200.dp)
                            )

                            Text(
                                text = "Smrithi",
                                style = MaterialTheme.typography.bodyLarge,
                                fontWeight = FontWeight.Bold,
                                color = Color.White,
                                modifier = Modifier.padding(top = 150.dp)
                            )
                        }
                        Box(

                            modifier = Modifier
                                .wrapContentHeight()
                                .fillMaxWidth()
                                .background(Color.White)

                        ) {
                            Column(
                                horizontalAlignment = Alignment.Start,
                                verticalArrangement = Arrangement.spacedBy(15.dp),
                                modifier = Modifier.padding(start = 50.dp)
                            ) {
                                Spacer(modifier = Modifier.height(10.dp))

                                Row(

                                ) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.profile_ic),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .size(30.dp),
                                        tint = Color(0xff46a8e9)
                                    )
                                    Spacer(modifier = Modifier.width(10.dp))
                                    Column {
                                        Text(
                                            text = "Reg.No",
                                            color = Color.Gray,
                                            style = MaterialTheme.typography.bodySmall,
                                            modifier = Modifier.padding(start = 10.dp)
                                        )
                                        Text(
                                            text = "1234",
                                            style = MaterialTheme.typography.bodySmall,
                                            modifier = Modifier.padding(start = 10.dp)
                                        )
                                    }

                                }
                                Row(
                                    horizontalArrangement = Arrangement.Start
                                ) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.baseline_menu_book_24),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .size(30.dp),
                                        tint = Color(0xff46a8e9)
                                    )
                                    Spacer(modifier = Modifier.width(10.dp))
                                    Column {
                                        Text(
                                            text = "Branch",
                                            color = Color.Gray,
                                            style = MaterialTheme.typography.bodySmall,
                                            modifier = Modifier.padding(start = 10.dp)
                                        )
                                        Text(
                                            text = "B.E.",
                                            style = MaterialTheme.typography.bodySmall,
                                            modifier = Modifier.padding(start = 10.dp)
                                        )
                                    }

                                }
                                Row(
                                    horizontalArrangement = Arrangement.Start
                                ) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.whitehouse),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .size(30.dp),
                                        tint = Color(0xff46a8e9)
                                    )
                                    Spacer(modifier = Modifier.width(10.dp))
                                    Column {
                                        Text(
                                            text = "Department",
                                            color = Color.Gray,
                                            style = MaterialTheme.typography.bodySmall,
                                            modifier = Modifier.padding(start = 10.dp)
                                        )
                                        Text(
                                            text = "Computer Scicence and Enginnering",
                                            style = MaterialTheme.typography.bodySmall,
                                            modifier = Modifier.padding(start = 10.dp)
                                        )
                                    }

                                }
                                Row(
                                    horizontalArrangement = Arrangement.Start
                                ) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.date),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .size(30.dp),
                                        tint = Color(0xff46a8e9)
                                    )
                                    Spacer(modifier = Modifier.width(10.dp))
                                    Column {
                                        Text(
                                            text = "Date of Birth",
                                            color = Color.Gray,
                                            style = MaterialTheme.typography.bodySmall,
                                            modifier = Modifier.padding(start = 10.dp)
                                        )
                                        Text(
                                            text = "06-10-2003",
                                            style = MaterialTheme.typography.bodySmall,
                                            modifier = Modifier.padding(start = 10.dp)
                                        )
                                    }

                                }
                                Row(
                                    horizontalArrangement = Arrangement.Start
                                ) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.gender),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .size(30.dp),
                                        tint = Color(0xff46a8e9)
                                    )
                                    Spacer(modifier = Modifier.width(10.dp))
                                    Column {
                                        Text(
                                            text = "Gender",
                                            color = Color.Gray,
                                            style = MaterialTheme.typography.bodySmall,
                                            modifier = Modifier.padding(start = 10.dp)
                                        )
                                        Text(
                                            text = "Female",
                                            style = MaterialTheme.typography.bodySmall,
                                            modifier = Modifier.padding(start = 10.dp)
                                        )
                                    }

                                }
                                Spacer(modifier = Modifier.height(10.dp))
                            }
                        }
                    }
                }
            }
        }
    }
}
