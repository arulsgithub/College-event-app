package com.example.induction.ui.theme.customDesign

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.induction.navigateAndClearStack
import com.example.induction.ui.theme.AquaBlue
import com.example.induction.ui.theme.DeepBlue


data class BottomMenuContents(
    val title: String,
    @DrawableRes val iconId: Int
)

@Composable
fun BottomNavigationMenu(
    items: List<BottomMenuContents>,
    navController: NavController,
    modifier: Modifier = Modifier,
    activeHighlightColor: Color = DeepBlue,
    activeTextColor: Color = Color.Black,
    inactiveTextColor: Color = Color.Gray,
    initialSelectedItemIndex: Int = 1
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    var selectedItemIndex by remember {
        mutableStateOf(
            items.indexOfFirst { it.title.equals(currentRoute, ignoreCase = true) }
                .takeIf { it != -1 } ?: initialSelectedItemIndex
        )
    }

    // Update the selected index whenever the current route changes
    LaunchedEffect(currentRoute) {
        selectedItemIndex = items.indexOfFirst { it.title.equals(currentRoute, ignoreCase = true) }
            .takeIf { it != -1 } ?: initialSelectedItemIndex
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 20.dp)
            .background(Color.Transparent),
        contentAlignment = Alignment.Center
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .size(height = 65.dp, width = 330.dp)
                .clip(RoundedCornerShape(50.dp))
                .background(Color.White)
                .padding(start = 25.dp, end = 20.dp)
        ) {
            items.forEachIndexed { index, item ->
                BottomMenuItems(
                    item = item,
                    isSelected = index == selectedItemIndex,
                    activeTextColor = activeTextColor,
                    inactiveTextColor = inactiveTextColor
                ) {
                    selectedItemIndex = index
                    if (item.title == "Home") {
                        navController.navigateAndClearStack(item.title)
                    } else {
                        navController.navigate(item.title) {
                            // Avoid building up a large stack of destinations
                            popUpTo(navController.graph.startDestinationId) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun BottomMenuItems(
    item: BottomMenuContents,
    isSelected: Boolean = false,
    activeTextColor: Color = Color.White,
    inactiveTextColor: Color = AquaBlue,
    onItemClick: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding()
            .clickable {
                onItemClick()
            }
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .clip(RoundedCornerShape(20.dp))
                .padding(5.dp)
        ) {
            Icon(
                painter = painterResource(id = item.iconId),
                contentDescription = item.title,
                tint = if (isSelected) activeTextColor else inactiveTextColor,
                modifier = Modifier.size(
                    if (isSelected) 30.dp else 20.dp
                )
            )
        }
        Text(
            text = item.title,
            color = if (isSelected) activeTextColor else inactiveTextColor,
            fontSize = 12.sp
        )
    }
}
