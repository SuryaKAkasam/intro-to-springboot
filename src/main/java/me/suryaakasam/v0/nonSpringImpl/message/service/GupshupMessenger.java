package me.suryaakasam.v0.nonSpringImpl.message.service;

import me.suryaakasam.v0.nonSpringImpl.message.utilities.ColorUtils;

public class GupshupMessenger implements MessageService {
    private ColorUtils colorUtils;

    public void setColorUtils(ColorUtils colorUtils) {
        this.colorUtils = colorUtils;
    }

    public ColorUtils getColorUtils() {
        return colorUtils;
    }

    @Override
    public void send(String message) {
        System.out.printf("%s Message sent... “%s”%n", colorUtils.addGreenColor("[GUPSHUP ]"), message);
    }
}
