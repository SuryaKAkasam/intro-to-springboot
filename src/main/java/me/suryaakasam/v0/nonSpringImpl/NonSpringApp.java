package me.suryaakasam.v0.nonSpringImpl;

import me.suryaakasam.v0.nonSpringImpl.message.controller.MessageController;

public class NonSpringApp {
    public static void main(String[] args) {
        MessageController messenger = new MessageController();
        messenger.sendMessage("Good Morning!");
    }
}