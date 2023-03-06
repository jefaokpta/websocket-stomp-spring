package com.example.websocketstomptest.websocket

import com.example.websocketstomptest.model.Message
import org.springframework.messaging.simp.SimpMessagingTemplate
import org.springframework.stereotype.Service

@Service
class MessageService(private val simpMessagingTemplate: SimpMessagingTemplate) {

    fun userPrivateMessage(message: Message) {
        println(message)
        simpMessagingTemplate.convertAndSendToUser(message.to, "/private", message) // /user/{username}/private
    }

    fun queueMessage(message: Message) {
        println(message)
        simpMessagingTemplate.convertAndSendToUser(message.controlNumber.toString(), "/queue", message) // /user/{username}/queue
    }
}