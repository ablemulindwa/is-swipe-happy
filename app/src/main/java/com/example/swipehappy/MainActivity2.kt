package com.example.swipehappy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

//This doc is for the main home screen
class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HomeScreen()
        }
    }
}


@Preview(showBackground = true)
//Composable is going to hold my layout and everything
@Composable
fun HomeScreen() {
    Column {
        //TODO: Handles fragment with settings
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Nav")
        }

        //TODO: Image card(or something) which displays data on a user, leading the person to make a choice
        //Remember the theme is cards, so implement accordingly

        //Handles user inputs for swiping
        Row {

            Button(onClick = { /*TODO*/ }) {
                Text(text = "Like")
            }

            Button(onClick = { /*TODO*/ }) {
                Text(text = "Dislike")
            }
        }

        //TODO: Handles fragment with chat and likes/matches
        Row {

            Button(onClick = { /*TODO*/ }) {
                Text(text = "Matches")
            }

            Button(onClick = { /*TODO*/ }) {
                Text(text = "Chat")
            }
        }
    }

}