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
import com.example.swipehappy.ui.theme.SwipeHappyTheme

//This doc is for the main login screen
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            loginDetails()
        }
    }
}

@Composable
fun loginDetails() {

    //Variables to save user input

    //Handles everything
    Column {

        //Handles Website logo section
        Column {
            //My website logo
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Swipe Happy logo",
                modifier = Modifier
                    .padding(10.dp)

            )

            //Welcoming texts and copy content
            Text("Welcome to Swipe Happy. The premier dating app for young singles worldwide.")
        }

        //Handles user inputs and validation
        Column {
            //Prompt 1
            Text("Enter email or phone number")

            //variable for username field
            var usernameText by remember {
                mutableStateOf("")
            }

            //collect user input for username
            TextField(
                value = usernameText,
                onValueChange = {usernameText = it}
            )

            //Prompt 2
            Text("Enter password")

            //Variable for password field
            var passwordText by remember {
                mutableStateOf("")
            }

            //collect user input for password
            TextField(
                value = passwordText,
                onValueChange = {passwordText = it}
            )

            Button(onClick = { /*TODO*/ }) {
                Text(text = "Login")
            }

            Button(onClick = { /*TODO*/ }) {
                Text(text = "Register")
            }
        }
    }

}
