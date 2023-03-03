package com.example.websocketstomptest.model

data class Message(
    val action: String,
    val controlNumber: Int,
    val from: String,
    val to: String,
    val message: String,
) {
}