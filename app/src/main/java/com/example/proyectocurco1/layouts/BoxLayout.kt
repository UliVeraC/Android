package com.example.proyectocurco1.layouts
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BoxLayout(){
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier.padding(vertical = 36.dp, horizontal = 24.dp)
            .fillMaxSize()
    ){
        Box(modifier = Modifier.size(100.dp)
            .background(color = Color.Green))
    }

    Box(
        contentAlignment = Alignment.TopEnd,
        modifier = Modifier.padding(vertical = 36.dp, horizontal = 24.dp)
            .fillMaxSize()
    ){
        Box(modifier = Modifier.size(100.dp)
            .background(color = Color.Green))
    }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.padding(vertical = 36.dp, horizontal = 24.dp)
            .fillMaxSize()
    ){
        Box(modifier = Modifier.size(100.dp)
            .background(color = Color.Green))
    }

    Box(
        contentAlignment = Alignment.BottomStart,
        modifier = Modifier.padding(vertical = 36.dp, horizontal = 24.dp)
            .fillMaxSize()
    ){
        Box(modifier = Modifier.size(100.dp)
            .background(color = Color.Green))
    }

    Box(
        contentAlignment = Alignment.BottomEnd,
        modifier = Modifier.padding(vertical = 36.dp, horizontal = 24.dp)
            .fillMaxSize()
    ){
        Box(modifier = Modifier.size(100.dp)
            .background(color = Color.Green))
    }

}