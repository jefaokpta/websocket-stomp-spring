package com.example.websocketstomptest.controller

import com.example.websocketstomptest.model.Message
import com.example.websocketstomptest.websocket.MessageService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class TestController(private val messageService: MessageService) {

    @PostMapping
    fun test(@RequestBody message: Message) = messageService.queueMessage(message)

}