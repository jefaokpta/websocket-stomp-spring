package com.example.websocketstomptest.controller

import com.example.websocketstomptest.model.Message
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.messaging.simp.SimpMessagingTemplate
import org.springframework.stereotype.Controller

@Controller
class GreetingController(private val simpMessagingTemplate: SimpMessagingTemplate) {

    @MessageMapping("/public")
    @SendTo("/topic/broadcast")
    fun greeting(message: Message): Message {
        println(message)
        return message
    }

    @MessageMapping("/private-message")
    fun privateGreeting(message: Message) {
        println(message)
        simpMessagingTemplate.convertAndSendToUser("jefao", "/private", message) // /user/{username}/private
    }
}