package com.example.websocketstomptest.model

data class Message(
    val action: String,// SEND_MESSAGE - UPDATE_QUEUE
    val controlNumber: Int,
    val from: String,
    val to: String,
    val message: String,
    val contact: String? = null,
) {
}