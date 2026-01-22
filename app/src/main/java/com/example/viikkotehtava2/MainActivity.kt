package com.example.viikkotehtava2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.viikkotehtava2.ui.theme.Viikkotehtava2Theme
import com.example.viikkotehtava2.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Viikkotehtava2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // HomeScreen käyttää ViewModelia suoraan
                    HomeScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}