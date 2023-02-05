package me.suryaakasam.v0.nonSpringImpl.message.controller;

import me.suryaakasam.v0.nonSpringImpl.message.factory.MessageFactory;
import me.suryaakasam.v0.nonSpringImpl.message.service.MessageService;

public class MessageController {
    private final MessageService messageService;

    public MessageController() {
        MessageFactory factory = new MessageFactory();
        this.messageService = factory.getMessageService(MessageFactory.WHATSAPP_MESSENGER);
    }

    public void sendMessage(String message) {
        messageService.send(message);
    }
}
