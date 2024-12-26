package com.example.proyectocurco1.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldLayout(){
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Red
                ),
                title = {
                    Text(text="AppBar")
            })
        },
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