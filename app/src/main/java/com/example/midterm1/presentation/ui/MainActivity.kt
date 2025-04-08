package com.example.midterm1.presentation.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.midterm1.presentation.ui.MainScreen
import com.example.midterm1.ui.theme.Midterm1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Midterm1Theme {
                MainScreen()
            }
        }
    }
}
