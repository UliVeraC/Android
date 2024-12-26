package com.example.proyectocurco1.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ScaffoldLayout(){
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                containerColor = Color.Gray,
                shape = CircleShape,
                onClick = {}) {
                Text(
                    text = "+",
                    fontSize = 24.sp,
                    color = Color.White
                )
            }
        }
    ) { paddingValues ->
        Box (
            contentAlignment = Alignment.BottomEnd,
            modifier = Modifier.padding(paddingValues)
                .fillMaxSize()
        ){

        }
    }
}