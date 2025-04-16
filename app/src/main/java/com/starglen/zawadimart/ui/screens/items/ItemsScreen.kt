package com.starglen.zawadimart.ui.screens.items

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.starglen.zawadimart.navigation.ROUT_INTENT
import com.starglen.zawadimart.R
import com.starglen.zawadimart.ui.theme.neworange
import com.starglen.zawadimart.ui.theme.newwhite

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemsScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize()
    ){
        //TopAppBar
        TopAppBar(
            title = { Text(text = "Products") },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = neworange,
                titleContentColor = newwhite,
                navigationIconContentColor = newwhite,
                actionIconContentColor = newwhite
            ),
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "")
                }
            },
            actions = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "")
                }
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "")
                }
                IconButton(onClick = {
                    navController.navigate(ROUT_INTENT)
                }) {
                    Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "")
                }
            }

        )
        //TopApp--end
        Spacer(modifier = Modifier.height(10.dp))

        //Splitsreeen
        Image(
            painter = painterResource(R.drawable.img_4),
            contentDescription = "img",
            modifier = Modifier.fillMaxWidth().height(250.dp),
            contentScale = ContentScale.FillWidth
        )
        Spacer(modifier = Modifier.height(20.dp))

//searchBar
var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = { search = it},
            modifier = Modifier.fillMaxWidth().padding(end = 20.dp, start = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "") },
            placeholder = { Text(text = "Search Here!!") }
        )
        //end of search bar

        Spacer(modifier = Modifier.height(20.dp))

        //row
        Row (modifier = Modifier.padding(start = 6.dp)){
            Image(
                painter = painterResource(R.drawable.img_3),
                contentDescription = "img",
                modifier = Modifier.width(200.dp).clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.FillWidth
            )

            Spacer(modifier = Modifier.width(10.dp))

            Column(){
            Text(
                text= "Porsche Taycan",
                fontWeight = FontWeight.ExtraBold)
            Text(text = "2.9-liter twin-turbo V6 engine, 8-speed PDK transmission, and all-wheel drive, along with technology like Porsche Connect and adaptive air suspension.",
                textAlign = TextAlign.Center)
            }
        }
        //endrow
        Column { Text(text = "Price: ksh.12,000,000",
            fontWeight = FontWeight.Bold,
            color = neworange)
        Button(
                onClick = {},
                shape = RoundedCornerShape(10.dp),
            )
            {
                Text(text = "Contact us")
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        //row
        Row (modifier = Modifier.padding(start = 6.dp)){
            Image(
                painter = painterResource(R.drawable.img_2),
                contentDescription = "img",
                modifier = Modifier.width(200.dp).clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.FillWidth
            )

            Spacer(modifier = Modifier.width(10.dp))

            Column(){
                Text(
                    text= "Porsche Panamera Turbo S",
                    fontWeight = FontWeight.ExtraBold)
                Text(text = "2.9-liter twin-turbo V6 engine, 8-speed PDK transmission, and all-wheel drive, along with technology like Porsche Connect and adaptive air suspension.",
                    textAlign = TextAlign.Center)

            }
        }
        //endrow


        Column { Text(text = "Price: ksh.19,000,000",
            fontWeight = FontWeight.Bold,
            color = neworange)
            Button(
                onClick = {},
                shape = RoundedCornerShape(10.dp),
            )
            {
                Text(text = "Contact us")
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ItemScreenPreview(){
    ItemsScreen(rememberNavController())
}