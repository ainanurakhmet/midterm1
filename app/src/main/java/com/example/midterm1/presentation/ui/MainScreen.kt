package com.example.midterm1.presentation.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.koin.androidx.compose.koinViewModel

@Composable
fun MainScreen() {
    val mainViewModel: MainViewModel = koinViewModel()

    val activities by mainViewModel.activities.collectAsState(initial = emptyList())

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Список активностей", style = MaterialTheme.typography.bodyLarge)

        Spacer(modifier = Modifier.height(16.dp))

        activities.forEach { activity ->
            Text(text = activity)
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { mainViewModel.getActivities() }) {
            Text("Загрузить активности")
        }
    }
}
