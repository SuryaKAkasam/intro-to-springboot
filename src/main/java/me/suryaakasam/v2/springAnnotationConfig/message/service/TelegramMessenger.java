package me.suryaakasam.v2.springAnnotationConfig.message.service;

import me.suryaakasam.v2.springAnnotationConfig.message.utilities.ColorUtils;
import me.suryaakasam.v2.springAnnotationConfig.message.utilities.TimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("telegram")
public class TelegramMessenger implements MessageService {
    private final ColorUtils colorUtils;
    private final TimeUtils timeUtils;

    @Autowired
    public TelegramMessenger(ColorUtils colorUtils, @Qualifier("time24HrsUtils") TimeUtils timeUtils) {
        this.colorUtils = colorUtils;
        this.timeUtils = timeUtils;
    }

    @Override
    public void send(String message) {
        System.out.printf("%s Message sent @%s... “%s”%n", colorUtils.addRedColor("[TELEGRAM]"),
                colorUtils.addCyanColor(timeUtils.getTime()), message);
    }
}
