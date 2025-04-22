package com.starglen.zawadimart.navigation


import DashboardScreen
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.starglen.zawadimart.data.UserDatabase
import com.starglen.zawadimart.navigation.ROUT_HOME
import com.starglen.zawadimart.navigation.ROUT_ABOUT
import com.starglen.zawadimart.navigation.ROUT_ASSIGN
import com.starglen.zawadimart.navigation.ROUT_DASH
import com.starglen.zawadimart.navigation.ROUT_FORM
import com.starglen.zawadimart.navigation.ROUT_FORM1
import com.starglen.zawadimart.navigation.ROUT_INTENT
import com.starglen.zawadimart.navigation.ROUT_ITEM
import com.starglen.zawadimart.navigation.ROUT_SERVICE
import com.starglen.zawadimart.navigation.ROUT_SPLASH
import com.starglen.zawadimart.navigation.ROUT_START
import com.starglen.zawadimart.repository.UserRepository
import com.starglen.zawadimart.ui.screens.about.AboutScreen
import com.starglen.zawadimart.ui.screens.assign.AssignScreen
import com.starglen.zawadimart.ui.screens.auth.LoginScreen
import com.starglen.zawadimart.ui.screens.auth.RegisterScreen
import com.starglen.zawadimart.ui.screens.form.FormScreen
import com.starglen.zawadimart.ui.screens.form1.Form1Screen
import com.starglen.zawadimart.ui.screens.home.HomeScreen
import com.starglen.zawadimart.ui.screens.intent.IntentScreen
import com.starglen.zawadimart.ui.screens.items.ItemsScreen
import com.starglen.zawadimart.ui.screens.products.AddProductScreen
import com.starglen.zawadimart.ui.screens.products.EditProductScreen
import com.starglen.zawadimart.ui.screens.products.ProductListScreen
import com.starglen.zawadimart.ui.screens.service.ServiceScreen
import com.starglen.zawadimart.ui.screens.splash.SplashScreen
import com.starglen.zawadimart.ui.screens.start.StartScreen
import com.starglen.zawadimart.viewmodel.AuthViewModel
import com.starglen.zawadimart.viewmodel.ProductViewModel

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_LOGIN,
    productViewModel: ProductViewModel = viewModel(),

    ) {

    val context = LocalContext.current

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_START) {
            StartScreen(navController)
        }
        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }
        composable(ROUT_ITEM) {
            ItemsScreen(navController)
        }
        composable(ROUT_DASH) {
          DashboardScreen(navController)
        }
        composable(ROUT_SERVICE) {
            ServiceScreen(navController)
        }
        composable(ROUT_SPLASH) {
            SplashScreen(navController)
        }
        composable(ROUT_ASSIGN) {
            AssignScreen(navController)
        }
        composable(ROUT_FORM) {
            FormScreen(navController)
        }
        composable(ROUT_FORM1) {
            Form1Screen(navController)
        }


        //AUTHENTICATION

        // Initialize Room Database and Repository for Authentication
        val appDatabase = UserDatabase.getDatabase(context)
        val authRepository = UserRepository(appDatabase.userDao())
        val authViewModel: AuthViewModel = AuthViewModel(authRepository)
        composable(ROUT_REGISTER) {
            RegisterScreen(authViewModel, navController) {
                navController.navigate(ROUT_LOGIN) {
                    popUpTo(ROUT_REGISTER) { inclusive = true }
                }
            }
        }

        composable(ROUT_LOGIN) {
            LoginScreen(authViewModel, navController) {
                navController.navigate(ROUT_HOME) {
                    popUpTo(ROUT_LOGIN) { inclusive = true }
                }
            }
        }


        // PRODUCTS
        composable(ROUT_ADD_PRODUCT) {
            AddProductScreen(navController, productViewModel)
        }

        composable(ROUT_PRODUCT_LIST) {
            ProductListScreen(navController, productViewModel)
        }

        composable(
            route = ROUT_EDIT_PRODUCT,
            arguments = listOf(navArgument("productId") { type = NavType.IntType })
        ) { backStackEntry ->
            val productId = backStackEntry.arguments?.getInt("productId")
            if (productId != null) {
                EditProductScreen(productId, navController, productViewModel)
            }
        }









    }
}