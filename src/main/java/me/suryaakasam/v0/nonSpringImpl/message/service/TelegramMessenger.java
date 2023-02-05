package me.suryaakasam.v0.nonSpringImpl.message.service;

import me.suryaakasam.v0.nonSpringImpl.message.utilities.ColorUtils;

public class TelegramMessenger implements MessageService {
    private final ColorUtils colorUtils;

    public TelegramMessenger(ColorUtils colorUtils) {
        this.colorUtils = colorUtils;
    }

    @Override
    public void send(String message) {
        System.out.printf("%s Message sent... “%s”%n", colorUtils.addRedColor("[TELEGRAM]"), message);
    }
}
