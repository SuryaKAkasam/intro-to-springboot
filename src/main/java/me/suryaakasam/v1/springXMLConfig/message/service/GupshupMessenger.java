package me.suryaakasam.v1.springXMLConfig.message.service;

import me.suryaakasam.v1.springXMLConfig.message.utilities.ColorUtils;
import me.suryaakasam.v1.springXMLConfig.message.utilities.TimeUtils;

public class GupshupMessenger implements MessageService {
    private ColorUtils colorUtils;
    private TimeUtils timeUtils;

    public void setColorUtils(ColorUtils colorUtils) {
        this.colorUtils = colorUtils;
    }

    public ColorUtils getColorUtils() {
        return colorUtils;
    }

    public TimeUtils getTimeUtils() {
        return timeUtils;
    }

    public void setTimeUtils(TimeUtils timeUtils) {
        this.timeUtils = timeUtils;
    }

    @Override
    public void send(String message) {
        System.out.printf("%s Message sent @%s... “%s”%n", colorUtils.addGreenColor("[GUPSHUP ]"),
                colorUtils.addCyanColor(timeUtils.getTime()), message);
    }
}
