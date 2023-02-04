package me.suryaakasam;

import me.suryaakasam.message.controller.MessageController;
import me.suryaakasam.message.service.GupshupService;
import me.suryaakasam.message.service.MessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("me.suryaakasam");

        /* BEAN SCOPES
        Available in any context:
            Singleton (Default) : The Spring container gives a same bean instance every time (used for stateless beans)
            Prototype           : The Spring container gives a new bean instance every time (used for stateful beans)
        Available only in the Web context:
            Request             : The Spring container gives a new bean instance for every HTTP request
            Session             : The Spring container gives a new bean instance for every user-level HTTP session
            Global-session      : The Spring container gives a new bean instance for every app-level global HTTP session
         */
        ((MessageService) context.getBean("whatsapp")).send("Good morning!");
        context.getBean("telegram", MessageService.class).send("Good morning!");
        context.getBean(GupshupService.class).send("Good morning!");

        MessageService whatsappService1 = context.getBean("whatsapp", MessageService.class);
        MessageService whatsappService2 = context.getBean("whatsapp", MessageService.class);
        System.out.println("Is whatsapp bean (Singleton scoped) a singleton? " + (whatsappService1 == whatsappService2));

        MessageService telegramService1 = context.getBean("telegram", MessageService.class);
        MessageService telegramService2 = context.getBean("telegram", MessageService.class);
        System.out.println("Is telegram bean (Prototype scoped) a singleton? " + (telegramService1 == telegramService2));

        MessageController messageController = (MessageController) context.getBean("messageController");
        messageController.sendMessage("Have a good day!");
    }
}