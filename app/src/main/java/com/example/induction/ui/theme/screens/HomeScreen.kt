package com.example.induction.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.induction.R
import com.example.induction.ui.theme.DarkGreen
import com.example.induction.ui.theme.TextWhite
import com.example.induction.ui.theme.lightblue

@Composable
fun HomeScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.bgfull),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .padding(top = 30.dp)
        ) {
            Greeting();
            ChipSection(chip = listOf("Chip1", "Chip2", "Chip3", "Chip4"))
            Grids()
        }
    }
}

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

@Composable
fun ChipSection(
    chip: List<String>
){
    var selectedChipIndex by remember {
        mutableIntStateOf(0)
    }

    LazyRow(

    ) {
        items(chip.size){

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(height = 170.dp, width = 280.dp)

                    .padding(start = 10.dp, top = 10.dp, bottom = 10.dp)
                    .clickable {
                        selectedChipIndex = it
                    }
                    .clip(RoundedCornerShape(15.dp))
                    .background(Color.White)
                    .padding(16.dp)

            ){
                Column(
                    verticalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxSize()
                ) {

                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .size(height = 40.dp, width = 60.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(DarkGreen)
                                
                        ){
                            Text(
                                text = "Now",
                                color = Color.White,
                                style = MaterialTheme.typography.bodySmall
                            )
                        }
                        
                        Text(
                            text = "09:00AM - 10:00AM",
                            color = Color.Black,
                            style = MaterialTheme.typography.bodySmall
                        )
                    }

                    Text(
                        text = "Meeting by Department of CSE",
                        style = MaterialTheme.typography.bodyLarge
                    )
                    Row {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_location_on_24),
                            contentDescription = null,
                            modifier = Modifier
                                .size(20.dp)
                        )
                        Text(
                            text = "Vivek Audi",
                            color = Color.Black,
                            style = MaterialTheme.typography.bodySmall
                        )
                    }
                }
            }
        }
    }
}

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
                                Column {
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
                                            .padding(start = 10.dp, bottom = 10.dp)
                                    )
                                }
                            }
                        }
                    }
                    Box(
                        modifier = Modifier
                            .size(height = 125.dp, width = 100.dp)
                            .clip(RoundedCornerShape(15.dp))
                            .background(lightblue)
                    ){
                        Column {
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
                                    .padding(start = 10.dp, bottom = 10.dp)
                            )
                        }
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
                        .padding(start = 30.dp, top = 30.dp)
                        .rotate(330f)
                        .size(height = 100.dp, width = 200.dp),
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
