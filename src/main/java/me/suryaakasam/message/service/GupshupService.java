package me.suryaakasam.message.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("gupshup")
public class GupshupService implements MessageService {
    private FormatService formatService;

    @Autowired //Setter Injection
    public void setFormatService(FormatService formatService) {
        this.formatService = formatService;
    }

    @Override
    public void send(String message) {
        System.out.printf("[%s] Message sent... “%s”%n", formatService.addGreenColor("GUPSHUP "), message);
    }
}
