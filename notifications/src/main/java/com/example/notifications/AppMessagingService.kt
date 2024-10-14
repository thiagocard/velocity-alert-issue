package com.example.notifications

import com.google.firebase.messaging.FirebaseMessagingService

class AppMessagingService : FirebaseMessagingService() {

    override fun onNewToken(token: String) {
        super.onNewToken(token)
    }

}