package com.example.jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack.ui.theme.JetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    JetpackLogoWithText("Shivaanisree")
                }
            }
        }
    }
}
@Composable
fun JetpackLogoWithImage(){
    val image = painterResource(id = R.drawable.jetpackcompose_logo)
    Box{
        Image(painter = image, contentDescription = null,
            modifier = Modifier.align(Alignment.Center))
    }

    
}

@Composable
fun JetpackLogoWithText(name: String) {

        Text(
            text = name, color = Color(56,112,179,255),
            textAlign = TextAlign.Center,
            fontSize = 45.sp,fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxSize()
                .wrapContentWidth(align = Alignment.CenterHorizontally)
                .padding(start = 30.dp, top = 300.dp, end = 30.dp, bottom = 30.dp))
}
@Composable
fun JetpackLogoWithImages(){
    val image = painterResource(id = R.drawable.heart_png_15)
    Box{
        Image(painter = image, contentDescription = null,
        modifier = Modifier.align(Alignment.Center)
            .padding(start = 150.dp, top = 400.dp, end = 30.dp, bottom = 30.dp))
    }

}
@Composable
fun JetpackLogoWithTexts(title:String){
    Text(text = title, color = Color(8,48,66,255),
        textAlign = TextAlign.Center,
        fontSize = 45.sp, fontWeight = FontWeight.Bold,
        modifier = Modifier
            .fillMaxSize()
            .wrapContentWidth(align = Alignment.CenterHorizontally)
            .padding(start = 0.dp, top = 500.dp, end = 0.dp, bottom = 0.dp))

}







@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackTheme {
        JetpackLogoWithText("Shivaanisree ")
        JetpackLogoWithTexts(title = "Jetpack Compose")
        JetpackLogoWithImage()
        JetpackLogoWithImages()

    }
}