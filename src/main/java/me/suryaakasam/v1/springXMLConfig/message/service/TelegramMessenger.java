package me.suryaakasam.v1.springXMLConfig.message.service;

import me.suryaakasam.v1.springXMLConfig.message.utilities.ColorUtils;
import me.suryaakasam.v1.springXMLConfig.message.utilities.TimeUtils;

import java.beans.ConstructorProperties;

public class TelegramMessenger implements MessageService {
    private final ColorUtils colorUtils;
    private TimeUtils timeUtils;

    @ConstructorProperties({"colorUtils"})
    public TelegramMessenger(ColorUtils colorUtils) {
        this.colorUtils = colorUtils;
    }

    public void setTimeUtils(TimeUtils timeUtils) {
        this.timeUtils = timeUtils;
    }

    public TimeUtils getTimeUtils() {
        return timeUtils;
    }

    @Override
    public void send(String message) {
        System.out.printf("%s Message sent @%s... “%s”%n", colorUtils.addRedColor("[TELEGRAM]"),
                colorUtils.addCyanColor(timeUtils.getTime()), message);
    }
}
