package com.starglen.zawadimart.ui.screens.assign

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.starglen.zawadimart.navigation.ROUT_HOME
import com.starglen.zawadimart.navigation.ROUT_ITEM
import com.starglen.zawadimart.R
import com.starglen.zawadimart.ui.theme.black
import com.starglen.zawadimart.ui.theme.newblue
import com.starglen.zawadimart.ui.theme.neworange
import com.starglen.zawadimart.ui.theme.white


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AssignScreen(navController: NavController){


    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        //TopBar
        topBar = {
            TopAppBar(
                title = { Text("Welcome, Samantha") },
                navigationIcon = {
                    IconButton(onClick = { /* Handle back/nav */ }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.White,
                    titleContentColor = Color.Black,
                    navigationIconContentColor = Color.Black
                )
            )
        },// End of top bar

        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = Color.White
            ){
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },

                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0
                        navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.DateRange, contentDescription = "Favorites") },

                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1

                        navController.navigate(ROUT_ITEM)
                    }


                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Email, contentDescription = "Home") },

                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0
                        navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.AccountCircle, contentDescription = "Home") },

                    selected = selectedIndex == 0,

                    onClick = { selectedIndex = 0
                        navController.navigate(ROUT_HOME)
                    }
                )

            }
        },// End of bottom bar


        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
            ) {
                Spacer(modifier = Modifier.height(15.dp))
                Text(
                    modifier = Modifier.padding(start = 30.dp),
                    text = "Hi Samantha",
                    fontSize = 35.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = black
                )
                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    modifier = Modifier.padding(start = 30.dp),
                    text = "Here are your projects",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal,
                    color = black
                )
                Spacer(modifier = Modifier.height(40.dp))


                //Row
                Row(modifier = Modifier.padding(start = 10.dp)
                    .horizontalScroll(rememberScrollState())) {

                    //Card 1
                    Card(modifier = Modifier
                        .width(200.dp)
                        .height(300.dp)


                        ) {


                        Column(
                            modifier = Modifier.fillMaxSize().background(newblue).padding(start = 20.dp),
                            horizontalAlignment = Alignment.Start,
                            verticalArrangement = Arrangement.Center,


                        ) {

                            //image 1
                            Image(
                                painter = painterResource(R.drawable.img_18),
                                contentDescription = "img",
                                modifier = Modifier.size(100.dp)

                            )
                            Spacer(modifier = Modifier.height(15.dp))
                            Text(
                                text = "Cryptocurrency Landing Page",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.ExtraBold,
                                color = white
                            )
                            Spacer(modifier = Modifier.height(30.dp))

                            Text(
                                modifier = Modifier.padding(start = 20.dp),
                                text = "12 Tasks",
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold,
                                color = white

                            )
                        }

                    }
                    //End of card1

                    Spacer(modifier = Modifier.width(20.dp))

                    //Card 2
                    Card(modifier = Modifier
                        .width(200.dp)
                        .height(300.dp)


                    ) {


                        Column(
                            modifier = Modifier.fillMaxSize().background(Color.Red).padding(start = 20.dp),
                            horizontalAlignment = Alignment.Start,
                            verticalArrangement = Arrangement.Center,


                            ) {

                            //image 2
                            Image(
                                painter = painterResource(R.drawable.img_20),
                                contentDescription = "img",
                                modifier = Modifier.size(100.dp)

                            )
                            Spacer(modifier = Modifier.height(15.dp))
                            Text(
                                text = "Statistics Dashboard",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.ExtraBold,
                                color = white
                            )
                            Spacer(modifier = Modifier.height(30.dp))

                            Text(
                                modifier = Modifier.padding(start = 20.dp),
                                text = "12 Tasks",
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold,
                                color = white

                            )
                        }

                    }
                    //End of card2

                    Spacer(modifier = Modifier.width(20.dp))

                    //Card 3
                    Card(modifier = Modifier
                        .width(200.dp)
                        .height(300.dp)


                    ) {


                        Column(
                            modifier = Modifier.fillMaxSize().background(Color.LightGray).padding(start = 20.dp),
                            horizontalAlignment = Alignment.Start,
                            verticalArrangement = Arrangement.Center,


                            ) {

                            //image 3
                            Image(
                                painter = painterResource(R.drawable.img_21),
                                contentDescription = "img",
                                modifier = Modifier.size(100.dp)

                            )
                            Spacer(modifier = Modifier.height(15.dp))
                            Text(
                                text = "Cash flow",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.ExtraBold,
                                color = white
                            )
                            Spacer(modifier = Modifier.height(30.dp))

                            Text(
                                modifier = Modifier.padding(start = 40.dp),
                                text = "12 Tasks",
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold,
                                color = white

                            )
                        }

                    }
                    //End of card3

                    Spacer(modifier = Modifier.width(20.dp))


                }//End of row
                Spacer(modifier = Modifier.height(30.dp))




                   Text(
                       modifier = Modifier.padding(start = 20.dp),
                       text = "Personal Tasks",
                       fontSize = 20.sp,
                       fontWeight = FontWeight.ExtraBold,
                       color = black
                   )
                   Spacer(modifier = Modifier.height(20.dp))


                   //row2
                   Row (modifier = Modifier.padding(start = 20.dp)){
                       Image(
                           painter = painterResource(R.drawable.img_22),
                           contentDescription = "img",
                           modifier = Modifier.size(60.dp)

                       )

                       Spacer(modifier = Modifier.width(20.dp))

                       Column(){
                           Text(
                               modifier = Modifier.padding(vertical = 10.dp),
                               text= "NDA Review for Website Project                        ",
                               fontWeight = FontWeight.ExtraBold)
                           Text(text = "Today . 10pm",
                               textAlign = TextAlign.Center)
                       }
                   }
                   //end of row2

                   Spacer(modifier = Modifier.height(30.dp))

                   //row3
                   Row (modifier = Modifier.padding(start = 20.dp)){
                       Image(
                           painter = painterResource(R.drawable.img_23),
                           contentDescription = "img",
                           modifier = Modifier.size(60.dp)

                       )

                       Spacer(modifier = Modifier.width(20.dp))

                       Column(){
                           Text(
                               modifier = Modifier.padding(vertical = 10.dp),
                               text= "Email Reply for Green Project                        ",
                               fontWeight = FontWeight.ExtraBold)
                           Text(text = "Today . 10pm",
                               textAlign = TextAlign.Center)
                       }
                   }
                   //end of row 3





            }
        }
    )

    //End of scaffold

}


@Preview(showBackground = true)
@Composable
fun AssignScreenPreview(){
    AssignScreen(rememberNavController())
}