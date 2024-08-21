package com.example.induction.ui.theme.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.induction.R
import com.example.induction.ui.theme.DarkGreen

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
                    .size(height = 160.dp, width = 280.dp)

                    .padding(start = 10.dp, top = 1.dp, bottom = 10.dp)
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