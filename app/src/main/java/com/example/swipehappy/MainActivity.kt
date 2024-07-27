package com.example.swipehappy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.swipehappy.ui.theme.SwipeHappyTheme

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

