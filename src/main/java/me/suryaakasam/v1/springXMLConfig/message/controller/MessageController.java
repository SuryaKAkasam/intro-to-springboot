package me.suryaakasam.v1.springXMLConfig.message.controller;

import me.suryaakasam.v1.springXMLConfig.message.service.MessageService;

public class MessageController {
    private MessageService messageService;

    public MessageService getMessageService() {
        return messageService;
    }

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendMessage(String message) {
        messageService.send(message);
    }
}
