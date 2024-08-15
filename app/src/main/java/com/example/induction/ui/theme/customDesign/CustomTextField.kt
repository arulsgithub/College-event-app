package com.example.induction.ui.theme.customDesign

//noinspection UsingMaterialAndMaterial3Libraries
//noinspection UsingMaterialAndMaterial3Libraries
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.OutlinedTextField
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomTextField(txt: String){
    Column(
        Modifier
            .fillMaxSize()
            .padding(32.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        var textState by remember { mutableStateOf(TextFieldValue()) }
        var focusState by remember { mutableStateOf("") }

        val focusRequester = FocusRequester()

        Text(
            text = focusState,
            fontSize = 22.sp,
            fontFamily = FontFamily.Monospace,
            color = Color.Black
        )

        OutlinedTextField(
            value = textState,
            onValueChange = { textState = it },
            label = { Text(text = txt) },
            modifier = Modifier
                .focusRequester(focusRequester)
                .fillMaxWidth()
        )
    }
}


@Preview
@Composable
fun ComposablePreview(){
    //MainContent()
}