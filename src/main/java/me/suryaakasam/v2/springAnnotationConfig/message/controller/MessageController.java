package me.suryaakasam.v2.springAnnotationConfig.message.controller;

import me.suryaakasam.v2.springAnnotationConfig.message.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageController {
    private final MessageService messageService;

    @Autowired
    public MessageController(@Qualifier("whatsapp") MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendMessage(String message) {
        messageService.send(message);
    }
}
