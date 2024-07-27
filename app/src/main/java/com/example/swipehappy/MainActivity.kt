package com.example.swipehappy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.swipehappy.com.example.swipehappy.Register1
import com.example.swipehappy.com.example.swipehappy.Register2
import com.example.swipehappy.com.example.swipehappy.loginDetails

//This doc is for the main login screen
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //Navigation controller to the different screens.
            val navController = rememberNavController()

            //Navigation Host to set routes to the different screens.
            NavHost(navController = navController, startDestination = "loginDetails", builder = {

                //The Login Page
                composable("loginDetails"){
                    loginDetails(navController)
                }

                //The 1st Register Page
                composable("Register1"){
                    Register1(navController)
                }

                //The 2nd Register Page
                composable("Register2"){
                    Register2()
                }
            } )
        }
    }
}

