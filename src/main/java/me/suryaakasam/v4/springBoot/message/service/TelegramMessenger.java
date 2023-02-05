package me.suryaakasam.v4.springBoot.message.service;

import me.suryaakasam.v4.springBoot.message.utilities.ColorUtils;
import me.suryaakasam.v4.springBoot.message.utilities.TimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"dev"})
@Qualifier("telegramMessenger")
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
