package me.suryaakasam.message.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("whatsapp")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class WhatsappService implements MessageService {
    @Autowired //Field Injection
    private FormatService formatService;

    @Override
    public void send(String message) {
        System.out.printf("[%s] Message sent... “%s”%n", formatService.addBlueColor("WHATSAPP"), message);
    }
}
