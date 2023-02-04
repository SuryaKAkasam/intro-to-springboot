package me.suryaakasam.message.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("telegram")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TelegramService implements MessageService {
    private FormatService formatService;

    @Autowired //Constructor Injection
    public TelegramService(FormatService formatService) {
        this.formatService = formatService;
    }

    @Override
    public void send(String message) {
        System.out.printf("[%s] Message sent... “%s”%n", formatService.addRedColor("TELEGRAM"), message);
    }
}
