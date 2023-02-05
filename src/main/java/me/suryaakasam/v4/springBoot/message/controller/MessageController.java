package me.suryaakasam.v4.springBoot.message.controller;

import me.suryaakasam.v4.springBoot.message.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MessageController {
    @Autowired
    @Qualifier("whatsappMessenger")
    private MessageService whatsapp;

    @Value("${app.environment}")
    private String environment;

    @RequestMapping(
            path = "/",
            method = RequestMethod.GET
    )
    public String hello() {
        return "[" + environment + "] SpringBoot App says hello!";
    }

    @RequestMapping(
            path = "/whatsapp/send",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE
    )
    public String sendWhatsappMessage(@RequestParam Map<String, String> messages) {
        for (Map.Entry<String, String> message : messages.entrySet()) {
            if (message.getKey().startsWith("message")) {
                whatsapp.send(message.getValue());
            }
        }

        return "Messages sent!";
    }
}
