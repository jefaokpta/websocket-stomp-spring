package com.example.websocketstomptest.controller

import com.example.websocketstomptest.model.Message
import com.example.websocketstomptest.websocket.MessageService
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.stereotype.Controller

@Controller
class WebsocketController(private val messageService: MessageService) {

    @MessageMapping("/private-message")
    fun privateGreeting(message: Message) = messageService.userPrivateMessage(message)

}