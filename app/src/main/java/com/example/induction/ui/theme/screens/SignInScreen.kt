import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import com.example.induction.R
import com.example.induction.ui.theme.AquaBlue
import com.example.induction.ui.theme.fontFamily
import com.example.induction.ui.theme.hello_blue
import com.example.induction.ui.theme.light_bg

@Composable
fun SignInScreen(navController: NavController) {

    val sweepGradientBrush = Brush.horizontalGradient(
        colors = listOf(light_bg.copy(alpha = 1f), Color(0xFF008493).copy(alpha = 1f))
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.bg),
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
                .zIndex(-1f),
            contentScale = ContentScale.Crop
        )
        LazyColumn(
            modifier = Modifier
                .padding(top = 100.dp)
        ) {
            item {
                val gradientBrush = Brush.horizontalGradient(
                    colors = listOf(hello_blue, hello_blue, light_bg),
                    startX = 200f,
                    endX = 500f
                )

                Text(
                    text = "\"Hola",
                    style = TextStyle(
                        gradientBrush,
                        fontSize = 60.sp,
                        fontFamily = fontFamily,
                        textAlign = TextAlign.Start,
                        fontWeight = FontWeight.W900
                    ),
                    modifier = Modifier.padding(start = 30.dp)
                )
                Text(
                    text = "CEGians\"",
                    style = TextStyle(
                        gradientBrush,
                        fontSize = 60.sp,
                        fontFamily = fontFamily,
                        textAlign = TextAlign.Start,
                        fontWeight = FontWeight.W900
                    ),
                    modifier = Modifier.padding(start = 30.dp)
                )
            }

            item {
                Spacer(modifier = Modifier.height(50.dp))
                Text(
                    text = "Login with your credentials",
                    fontWeight = FontWeight.W200,
                    fontFamily = fontFamily,
                    fontSize = 15.sp,
                    modifier = Modifier
                        .padding(start = 40.dp, end = 100.dp, bottom = 8.dp)
                )
            }

            item {
                Spacer(modifier = Modifier.height(10.dp))

                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(80.dp)
                ) {
                    var textState by remember { mutableStateOf(TextFieldValue()) }
                    var focusState by remember { mutableStateOf("") }
                    val interactionSource = remember { MutableInteractionSource() }
                    val isFocused by interactionSource.collectIsFocusedAsState()

                    OutlinedTextField(
                        value = textState,
                        onValueChange = { textState = it },
                        label = {
                            Text(
                                text = "Roll Number",
                                style = MaterialTheme.typography.bodyLarge,
                                color = if (isFocused) AquaBlue else Color.Black,
                                modifier = Modifier.padding(top = 8.dp)
                            )
                        },
                        leadingIcon = {
                            Icon(
                                painter = painterResource(id = R.drawable.profile_ic),
                                contentDescription = null,
                                modifier = Modifier.size(25.dp)
                            )
                        },
                        modifier = Modifier
                            .width(290.dp)
                            .height(80.dp),
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            textColor = Color.Black,
                            focusedBorderColor = AquaBlue,
                            unfocusedBorderColor = Color.White,
                            backgroundColor = Color.White,
                            cursorColor = AquaBlue,
                            focusedLabelColor = Color.Blue
                        ),
                        shape = RoundedCornerShape(15.dp),
                        interactionSource = interactionSource,
                        textStyle = TextStyle(
                            color = Color.Black,
                            textAlign = TextAlign.Start,
                        ),
                        singleLine = true
                    )
                }
            }

            item {
                Spacer(modifier = Modifier.height(10.dp))

                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(80.dp)
                ) {
                    var textState by remember { mutableStateOf(TextFieldValue()) }
                    var focusState by remember { mutableStateOf("") }
                    val interactionSource = remember { MutableInteractionSource() }
                    val isFocused by interactionSource.collectIsFocusedAsState()

                    OutlinedTextField(
                        value = textState,
                        onValueChange = { textState = it },
                        label = {
                            Text(
                                text = "Password",
                                style = MaterialTheme.typography.bodyLarge,
                                color = if (isFocused) AquaBlue else Color.Black,
                                modifier = Modifier.padding(top = 8.dp)
                            )
                        },
                        leadingIcon = {
                            Icon(
                                painter = painterResource(id = R.drawable.padlock),
                                contentDescription = null,
                                modifier = Modifier.size(25.dp)
                            )
                        },
                        modifier = Modifier
                            .width(290.dp)
                            .height(80.dp),
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            textColor = Color.Black,
                            focusedBorderColor = AquaBlue,
                            unfocusedBorderColor = Color.White,
                            backgroundColor = Color.White,
                            cursorColor = AquaBlue,
                            focusedLabelColor = Color.Blue
                        ),
                        shape = RoundedCornerShape(15.dp),
                        interactionSource = interactionSource,
                        textStyle = TextStyle(
                            color = Color.Black,
                            textAlign = TextAlign.Start,
                        ),
                        singleLine = true
                    )
                }
            }

            item {
                Spacer(modifier = Modifier.height(15.dp))

                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .width(330.dp)
                        .height(90.dp)
                        .padding(top = 20.dp, start = 30.dp)
                        .clip(RoundedCornerShape(15.dp))
                        .background(hello_blue)
                        .clickable {
                            navController.navigate("home")
                        }
                ) {
                    Text(
                        text = "Login",
                        style = MaterialTheme.typography.bodyLarge,
                        color = Color.White,
                    )
                }
            }

            item {
                Spacer(modifier = Modifier.height(15.dp))

                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .padding(start = 290.dp, top = 70.dp)
                        .width(60.dp)
                        .height(60.dp)
                        .clip(RoundedCornerShape(50.dp))
                        .background(hello_blue)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.comment),
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier.size(25.dp)
                    )
                }
            }
        }
    }
}
