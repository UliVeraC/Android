package com.example.proyectocurco1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.proyectocurco1.layouts.ScaffoldLayout
import com.example.proyectocurco1.ui.theme.ProyectoCurco1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ScaffoldLayout()
        }
    }
}
