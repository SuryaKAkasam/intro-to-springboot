package me.suryaakasam.v0.nonSpringImpl.message.service;

import me.suryaakasam.v0.nonSpringImpl.message.utilities.ColorUtils;

public class WhatsappMessenger implements MessageService {
    private ColorUtils colorUtils;

    @Override
    public void send(String message) {
        System.out.printf("%s Message sent... “%s”%n", colorUtils.addBlueColor("[WHATSAPP]"), message);
    }
}
