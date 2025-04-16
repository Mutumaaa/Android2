package com.starglen.zawadimart.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.starglen.zawadimart.navigation.ROUT_START
import com.starglen.zawadimart.R

@Composable
fun HomeScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize()
            .paint(painter = painterResource(R.drawable.img_13), contentScale = ContentScale.FillBounds)
    ) {
        Text(
            text = "ZawadiMart",
            fontSize = 30.sp,
            color = Color.Blue,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Cursive,
            textDecoration = TextDecoration.Underline
        )

        Text(
            text = "WELCOME TO ZAWADIMART",
            fontSize = 18.sp,
            fontStyle = FontStyle.Italic

        )

        Image(
            painter = painterResource(R.drawable.img),
            contentDescription = "img"
        )


        Button(
            onClick = {
                navController.navigate(ROUT_START)
            },
            shape = RoundedCornerShape(10.dp),
            )
        {
            Text(text = "Add to Cart")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())
}