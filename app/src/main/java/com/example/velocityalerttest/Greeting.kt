package com.example.velocityalerttest

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.time.Duration.Companion.seconds

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    LaunchedEffect(Unit) {
        // Force a crash with a small delay
        CoroutineScope(Dispatchers.Main).launch {
            delay(6.seconds)
            throw RuntimeException("Velocity alert test")
        }
    }
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}