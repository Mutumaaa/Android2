package com.starglen.zawadimart.ui.screens.form1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.starglen.zawadimart.navigation.ROUT_ITEM
import com.starglen.zawadimart.R
import com.starglen.zawadimart.ui.theme.PurpleGrey80
import com.starglen.zawadimart.ui.theme.grey
import com.starglen.zawadimart.ui.theme.navy
import com.starglen.zawadimart.ui.theme.orange



@Composable
fun Form1Screen(navController: NavController){

    Column(modifier = Modifier.fillMaxSize()
        .background(navy)
        .verticalScroll(rememberScrollState()) // Enable to scroll

    ){

       //Card1
        Card (
            modifier = Modifier.fillMaxWidth().height(400.dp),
            colors = CardDefaults.cardColors(navy)
        ){

            //row 1
            Row(modifier = Modifier.padding(vertical = 30.dp, horizontal = 80.dp)){
                //column1
                Column {
                    Image(
                        painter = painterResource(R.drawable.img_26),
                        contentDescription = "img",
                        modifier = Modifier.size(60.dp)
                    )
                }// End of column1

                Spacer(modifier = Modifier.width(20.dp))

                //column2
                Column {

                    Text(
                        text = "Logo App ",
                        fontSize = 30.sp, // Size
                        fontWeight = FontWeight.Normal, //Density
                        color = grey,
                        modifier = Modifier.padding(vertical = 15.dp)

                    )
                }
                // end of column2


            }// row 1


            //Row2
            Row (){
                Image(
                painter = painterResource(R.drawable.img_27),
                contentDescription = "img",
                modifier = Modifier.size(400.dp).padding(bottom = 30.dp)
            ) }//End of Row

        } // end of card1

        //Card2
        Card (
            modifier = Modifier.fillMaxWidth().height(600.dp),
            shape = RoundedCornerShape(topStart = 60.dp,  topEnd = 60.dp),
        ){
            //Start of row
            Row (modifier = Modifier.padding(start = 60.dp, top = 30.dp)){
                Text(
                text = "The Most Worthy  Grocery App ",
                fontSize = 35.sp, // Size
                fontWeight = FontWeight.ExtraBold, //Density
                color = orange
            )
            }//End of row
            Spacer(modifier = Modifier.height(30.dp))

            var username by remember { mutableStateOf("") }
            var password by remember { mutableStateOf("") }
            //User name  (outlined text field =)
            OutlinedTextField(
                value = username,
                onValueChange = {username = it},
                modifier = Modifier.padding(start = 30.dp, end = 30.dp).fillMaxWidth(),
                shape = RoundedCornerShape(40.dp),
                label = {Text(text = "                Username",fontSize = 22.sp,fontWeight = FontWeight.Medium, modifier = Modifier.background(PurpleGrey80))},
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = PurpleGrey80,
                    unfocusedContainerColor = PurpleGrey80


                ),

                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )// end of User name

            Spacer(modifier = Modifier.height(15.dp))

            //Password
            OutlinedTextField(
                value = password,
                onValueChange = {password = it},
                modifier = Modifier.padding(start = 30.dp, end = 30.dp).fillMaxWidth(),
                shape = RoundedCornerShape(40.dp),
                label = {Text(text = "                Password",fontSize = 22.sp,fontWeight = FontWeight.Medium, )},
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = PurpleGrey80,
                    unfocusedContainerColor = PurpleGrey80


                ),

                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )// end of Password
            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = {
                    navController.navigate(ROUT_ITEM)
                },
                shape = RoundedCornerShape(60.dp),
                colors = ButtonDefaults.buttonColors(orange),
                modifier = Modifier.padding(start = 30.dp, end = 30.dp).fillMaxWidth().height(63.dp)
            )
            {
                Text(text = "Sign up", fontSize = 22.sp , fontWeight = FontWeight.Medium)
            }

            Spacer(modifier = Modifier.height(25.dp))

           Column {

               Row {  Text(text = "Already a member?",
                   modifier = Modifier.padding(start = 80.dp),
                   fontSize = 20.sp

               )

               Row {   Text(text = "Log in",
                   modifier = Modifier.padding(start = 10.dp),
                   fontSize = 20.sp,
                   color = orange

               ) }}
           }

        }
        //End of Card2





    }


}


@Preview(showBackground = true)
@Composable
fun Form1ScreenPreview(){
    Form1Screen(rememberNavController())
}