package com.example.unscrambledemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.unscrambledemo.ui.theme.UnscrambleDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UnscrambleDemoTheme {
                    GameScreen()
                }
            }
        }
    }


@Composable
fun GameScreen(){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(
            text ="UNSCRAMBLE",
            fontSize = 30.sp
        )
        Text(
            text = "TAC",
            fontSize = 30.sp
        )
        Text(
            text = "Unscramble the word!"
        )
        OutlinedTextField(
            value ="",
            onValueChange = { },
            label = {
                Text("Enter your answer here")
            }
        )
        Button(
            onClick = { }
        ) {
            Text("SUBMIT")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UnscrambleDemoTheme {
        GameScreen()
    }
}