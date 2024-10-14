package com.example.velocityalerttest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.velocityalerttest.ui.theme.VelocityAlertTestTheme
import com.google.firebase.Firebase
import com.google.firebase.FirebaseOptions
import com.google.firebase.crashlytics.FirebaseCrashlytics
import com.google.firebase.initialize

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize Firebase with multi project support
        val options = FirebaseOptions.Builder()
            .setProjectId("velocity-alert-test")
            .setApplicationId("1:804594587965:android:5a8ef495009641f809cd54")
            .setApiKey("AIzaSyAU5j9cvG0s2nmNKzOo1CgEASwQqaWRV0E")
            .build()

        val firebaseApp = Firebase.initialize(this, options, "firebase-crashlytics")

        // Programmatically set the collection enabled to simulate our real-world scenario
        firebaseApp.get(FirebaseCrashlytics::class.java).isCrashlyticsCollectionEnabled = true

        enableEdgeToEdge()
        setContent {
            VelocityAlertTestTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    VelocityAlertTestTheme {
        Greeting("Android")
    }
}