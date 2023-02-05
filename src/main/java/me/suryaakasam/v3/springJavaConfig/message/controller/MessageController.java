package me.suryaakasam.v3.springJavaConfig.message.controller;

import me.suryaakasam.v3.springJavaConfig.message.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MessageController {
    @Autowired
    @Qualifier("whatsapp")
    private MessageService messageService;

    public void sendMessage(String message) {
        messageService.send(message);
    }
}
