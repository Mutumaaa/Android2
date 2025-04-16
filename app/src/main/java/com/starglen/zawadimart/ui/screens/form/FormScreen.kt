package com.starglen.zawadimart.ui.screens.form

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.starglen.zawadimart.navigation.ROUT_ITEM
import com.starglen.zawadimart.R
import com.starglen.zawadimart.ui.theme.lavender
import com.starglen.zawadimart.ui.theme.neworange
import java.nio.file.WatchEvent


@Composable
fun FormScreen(navController: NavController){

    Column (modifier = Modifier.fillMaxSize(),
       // .paint(painter = painterResource(R.drawable.img_13), contentScale = ContentScale.FillBounds), (for a whole background)

        horizontalAlignment = Alignment.CenterHorizontally,// CENTER CONTENTS ON SCREEN (could remove to start at the top)
        verticalArrangement = Arrangement.Center
        ){
        Spacer(modifier = Modifier.height(10.dp))

        Image(
            painter = painterResource(R.drawable.img_24),
            contentDescription = "img",
            modifier = Modifier.size(200.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "CREATE AN ACCOUNT ",
            fontSize = 30.sp, // Size
            fontWeight = FontWeight.ExtraBold, //Density

        )
        Spacer(modifier = Modifier.height(10.dp))

        // Variable
        var fullname by remember { mutableStateOf("") }
        var username by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var confirmpassword by remember { mutableStateOf("") }

       //Fullname  (outlined text field =)
        OutlinedTextField(
            value = fullname,
            onValueChange = {fullname = it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "", tint = lavender) }, // for default icons on jetpack
            label = {Text(text = "Fullname")},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = lavender,
                focusedBorderColor = Color.Gray
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )// end of fullname

        Spacer(modifier = Modifier.height(10.dp))
        //User name  (outlined text field =)
        OutlinedTextField(
            value = username,
            onValueChange = {fullname = it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Face, contentDescription = "", tint = lavender) }, // for default icons on jetpack
            label = {Text(text = "Username")},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = lavender,
                focusedBorderColor = Color.Gray
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )// end of User name


        Spacer(modifier = Modifier.height(10.dp))
        //Email  (outlined text field =)
        OutlinedTextField(
            value = email,
            onValueChange = {email = it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.MailOutline, contentDescription = "", tint = lavender) }, // for default icons on jetpack
            label = {Text(text = "Email")},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = lavender,
                focusedBorderColor = Color.Gray
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )// end of email

        Spacer(modifier = Modifier.height(10.dp))
        //Password  (outlined text field =)
        OutlinedTextField(
            value = password,
            onValueChange = {password = it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "", tint = lavender) }, // for default icons on jetpack
            label = {Text(text = "Password")},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = lavender,
                focusedBorderColor = Color.Gray
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation(),
        )// end of password

        Spacer(modifier = Modifier.height(10.dp))
        //Confirm password (outlined text field =)
        OutlinedTextField(
            value = confirmpassword,
            onValueChange = {confirmpassword = it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "", tint = lavender) }, // for default icons on jetpack
            label = {Text(text = "Confirm Password")},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = lavender, // for creating color illusion borders
                focusedBorderColor = Color.Gray
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation(),
        )// end of fullname

        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
                navController.navigate(ROUT_ITEM)
            },
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(lavender),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)
        )
        {
            Text(text = "Register")
        }


    }

}


@Preview(showBackground = true)
@Composable
fun FormScreenPreview(){
    FormScreen(rememberNavController())
}