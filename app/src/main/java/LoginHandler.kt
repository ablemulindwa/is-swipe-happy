package com.example.swipehappy

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

//TODO: Make the screens go to different files?
// Idk, find a way to use inheritance to make the app's code more abstracted and clearer.

//Code for the login screen
@Composable
fun loginDetails(navController: NavController) {

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

                //Go to Register page.
                Button(onClick = {
                    navController.navigate("Register1")
                }) {
                    Text(text = "Register")
                }
            }
        }

    }

//Code for the first registration screen
@Composable
fun Register1(navController: NavController){

        //Main panel: Organizing principle
        Column {
            //TODO: Add a Header or smth for all the fragments

            //Prompt
            Text ("Enter your details below")

            //First name
            Column {
                Text("Enter your first name")

                //Variable for first name
                var f_name by remember {
                    mutableStateOf("")
                }

                //collect user input
                TextField(
                    value = f_name,
                    onValueChange = {f_name = it}
                )
            }

            //Last name
            Column {
                Text("Enter your last name")

                //Variable for first name
                var l_name by remember {
                    mutableStateOf("")
                }

                //collect user input
                TextField(
                    value = l_name,
                    onValueChange = {l_name = it}
                )
            }

            //Email Address
            Column {
                Text("Email address")

                //Variable for email
                var email by remember {
                    mutableStateOf("")
                }

                //collect user input
                TextField(
                    value = email,
                    onValueChange = {email = it}
                )
            }

            //Phone number
            Column {
                Text("Phone number")

                //Variable for phone number
                var phone by remember {
                    mutableStateOf("")
                }

                //collect user input
                TextField(
                    value = phone,
                    onValueChange = {phone = it}
                )
            }

            //TODO: Gender
            Column {
                Text("Gender")

                //Variable for Gender
                var gender by remember {
                    mutableStateOf("")
                }

                //collect user input
                TextField(
                    value = gender,
                    onValueChange = {gender = it}
                )
            }

            //Date of Birth
            Column {
                Text("Date of Birth")

                //Variable for Date of Birth
                var dob by remember {
                    mutableStateOf("")
                }

                //collect user input
                TextField(
                    value = dob,
                    onValueChange = {dob = it}
                )
            }

            //Country
            Column {
                Text("Country")

                //Variable for Country
                var country by remember {
                    mutableStateOf("")
                }

                //collect user input
                TextField(
                    value = country,
                    onValueChange = {country = it}
                )
            }

            //City
            Column {
                Text("City")

                //Variable for City
                var city by remember {
                    mutableStateOf("")
                }

                //collect user input
                TextField(
                    value = city,
                    onValueChange = {city = it}
                )
            }

            //Next Screen Button
            Button(onClick = {
                navController.navigate("Register2")
            }) {
                Text(text = "Next")
            }
        }

    }

//Code for the second registration screen
@Composable
fun Register2(){

        //Main panel: Organizing principle
        Column {
            //TODO: Add a Header or smth for all the fragments

            //Prompt
            Text("Enter a secure password")

            //Password 1st
            Column {
                Text("Enter new password")

                //Variable for first name
                var password by remember {
                    mutableStateOf("")
                }

                //collect user input
                TextField(
                    value = password,
                    onValueChange = {password = it}
                )
            }

            //Password 2nd/Confirm
            Column {
                Text("Enter your last name")

                //Variable for first name
                var l_name by remember {
                    mutableStateOf("")
                }

                //collect user input
                TextField(
                    value = l_name,
                    onValueChange = {l_name = it}
                )
            }

            //Final Register Button
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Register")
            }
        }


    }

//@Preview (showBackground = true)