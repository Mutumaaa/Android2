import androidx.collection.intFloatMapOf
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.starglen.zawadimart.navigation.ROUT_ABOUT
import com.starglen.zawadimart.navigation.ROUT_HOME
import com.starglen.zawadimart.navigation.ROUT_ITEM
import com.starglen.zawadimart.R
import com.starglen.zawadimart.ui.theme.aqua
import com.starglen.zawadimart.ui.theme.neworange
import com.starglen.zawadimart.ui.theme.newwhite
import com.starglen.zawadimart.ui.theme.white
import java.nio.file.WatchEvent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize()
        .background(aqua)
        .verticalScroll(rememberScrollState()) // Enable to scroll

    ){


        Box{
            //Card
            Card (
                modifier = Modifier.fillMaxWidth().height(300.dp),
                shape = RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp),
                colors = CardDefaults.cardColors(white)



            ){

                TopAppBar(
                    title = { Text(text = "Dashboard Section") },
                    navigationIcon = {
                        IconButton(onClick = {}) {
                            Icon(imageVector = Icons.Default.Menu, contentDescription = "")
                        }

                    }


                )

            }// End of Card

            Card (modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .align(alignment = Alignment.BottomCenter)
                .padding(start = 20.dp, end = 20.dp).offset(y = 90.dp)


            )

            {

                Image(
                    painter = painterResource(R.drawable.img_12),
                    contentDescription = "img",
                    modifier = Modifier.fillMaxSize()
                )










            }

        }//end of box




        Spacer(modifier = Modifier.height(100.dp))

        //Row
        Row(modifier = Modifier.padding(start = 20.dp)) {

            //Card 1
            Card(modifier = Modifier
                .width(150.dp)
                .height(180.dp)
                .clickable{navController.navigate(ROUT_HOME)}) {

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    //image 1
                    Image(
                        painter = painterResource(R.drawable.img_9),
                        contentDescription = "img",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "Home", fontSize = 20.sp,
                        fontStyle = FontStyle.Italic)
                }

                }
                //End of card1

            Spacer(modifier = Modifier.width(20.dp))

              //Card 2
            Card(modifier = Modifier
                .width(150.dp)
                .height(180.dp)
                .clickable{navController.navigate(ROUT_ABOUT)}

            ) {

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    //image2
                    Image(
                        painter = painterResource(R.drawable.img_8),
                        contentDescription = "img",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "About", fontSize = 20.sp,
                        fontStyle = FontStyle.Italic)
                }

            }
            //End of card2


        }//End of row

        Spacer(modifier = Modifier.height(20.dp))

        //Row2
        Row(modifier = Modifier.padding(start = 20.dp)) {

            //Card 1
            Card(modifier = Modifier
                .width(150.dp)
                .height(180.dp)
                .clickable{navController.navigate(ROUT_HOME)}

            ) {

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    //image 3
                    Image(
                        painter = painterResource(R.drawable.img_11),
                        contentDescription = "img",
                        modifier = Modifier.size(100.dp)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "Contact", fontSize = 20.sp,
                        fontStyle = FontStyle.Italic)
                }

            }
            //End of card1

            Spacer(modifier = Modifier.width(20.dp))

            //Card 2
            Card(modifier = Modifier
                .width(150.dp)
                .height(180.dp)
                .clickable{navController.navigate(ROUT_ITEM)}

            ) {

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    //image 4
                    Image(
                        painter = painterResource(R.drawable.img_10),
                        contentDescription = "img",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "Product", fontSize = 20.sp,
                        fontStyle = FontStyle.Italic

                    )
                }

            }
            //End of card2


        }//End of row2








    }// End of column






}



//about,contact.product
//Install app ;it being the first screen
//text and center in large box




@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())
}

