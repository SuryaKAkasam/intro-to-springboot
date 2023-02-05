package me.suryaakasam.v1.springXMLConfig.message.service;

import me.suryaakasam.v1.springXMLConfig.message.utilities.ColorUtils;
import me.suryaakasam.v1.springXMLConfig.message.utilities.TimeUtils;

import java.beans.ConstructorProperties;

public class WhatsappMessenger implements MessageService {
    private final ColorUtils colorUtils;
    private final TimeUtils timeUtils;

    @ConstructorProperties({"colorUtils", "timeUtils"})
    public WhatsappMessenger(ColorUtils colorUtils, TimeUtils timeUtils) {
        this.colorUtils = colorUtils;
        this.timeUtils = timeUtils;
    }

    @Override
    public void send(String message) {
        System.out.printf("%s Message sent @%s... “%s”%n", colorUtils.addBlueColor("[WHATSAPP]"),
                colorUtils.addCyanColor(timeUtils.getTime()), message);
    }
}
