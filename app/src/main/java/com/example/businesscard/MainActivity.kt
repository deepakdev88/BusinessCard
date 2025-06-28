package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Surface (modifier = Modifier.fillMaxSize()) {
                    BusinessCard()
                }
            }
        }
    }
}



@Composable
fun BusinessCard(){
    Box (modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFF2E333D))
    ) {
        Column(modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally)
        {
            HeaderContent()
        }
        Column (modifier = Modifier
            .align(Alignment.BottomCenter)
            .padding(bottom = 60.dp),
            horizontalAlignment = Alignment.CenterHorizontally) {
            FooterContent()
        }
    }
}
@Composable
fun HeaderContent(){
    Image(
        painter = painterResource(R.drawable.android_logo),
        contentDescription = null,
        modifier = Modifier.size(100.dp),
        contentScale = ContentScale.Fit
    )
    Text(
        text = stringResource(R.string.Header_1),
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        color = Color.White,
        modifier = Modifier.padding(top = 8.dp, bottom = 4.dp)

    )
    Text(
        text = stringResource(R.string.Header_2),
        fontSize = 18.sp,
        color = Color.White,
        modifier = Modifier.padding(top = 8.dp, bottom = 4.dp)
    )
}

@Composable
fun FooterContent(){

        ContactRow(icon = Icons.Default.Phone,
            info = stringResource(R.string.Footer_1))



        ContactRow(icon = Icons.Default.Share,
            info = stringResource(R.string.Footer_2))


       ContactRow(icon = Icons.Default.Email,
           info = stringResource(R.string.Footer_3))


}

@Composable
fun ContactRow(icon: ImageVector, info: String){
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
            .padding(start = 80.dp),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    )
    {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(0xFF3ddc84),
            modifier = Modifier.size(20.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = info,
            color = Color.White,
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}