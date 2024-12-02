package com.example.myapplication.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
@Composable
fun SecondScreen(name: String, age: Int, navigateToThirdScreen: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Hello, $name!", fontSize = 24.sp)
        Text("You are $age years old.", fontSize = 18.sp)

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = navigateToThirdScreen) {
            Text("Go to Third Screen")
        }
    }
}

@Preview
@Composable
fun SecondScreenPreview() {
    SecondScreen("John", 25) {}
}
