package com.example.hsisariah

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.expandVertically
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.hsisariah.ui.theme.HSISariahTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HSISariahTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BackgroundImage()
                    TopImage()
                    BottomImage()
                }
            }
        }
    }
}



@Composable
fun GreetingText(header: String, body: String, modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Top,
        modifier = modifier
            .fillMaxSize()
    ) {
        Text(
            text = header,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally),
            fontSize = 15.sp
        )
        Text(
            text = body,
            fontSize = 15.sp,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
        )
    }
}

@Composable
fun TopImage(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        val image2 = painterResource(R.drawable.hsi_header)
        Image(
            painter = image2,
            contentDescription = null
        )
    }
}

@Composable
fun BackgroundImage() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.header_text),
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.body_text),
            modifier = Modifier
                .width(300.dp),
            fontSize = 16.sp
        )
        val image = painterResource(R.drawable.text_board)
        Image(
            painter = image,
            contentDescription = null
            //contentScale = ContentScale.Fit
        )
        val image3 = painterResource(R.drawable.hsi_button)
        Image(
            painter = image3,
            contentDescription = null
        )
    }
}

@Composable
fun BottomImage(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        val image4 = painterResource(R.drawable.hsi_bottom)
        Image(
            painter = image4,
            contentDescription = null
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HSISariahTheme {
        BackgroundImage()
        TopImage()
        BottomImage()
    }
}