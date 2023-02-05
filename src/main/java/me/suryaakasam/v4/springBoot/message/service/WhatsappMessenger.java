package me.suryaakasam.v4.springBoot.message.service;

import me.suryaakasam.v4.springBoot.message.utilities.ColorUtils;
import me.suryaakasam.v4.springBoot.message.utilities.TimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"dev", "qa"})
@Qualifier("whatsappMessenger")
public class WhatsappMessenger implements MessageService {
    @Autowired
    private ColorUtils colorUtils;
    @Autowired
    @Qualifier("time12HrsUtils")
    private TimeUtils timeUtils;

    @Override
    public void send(String message) {
        System.out.printf("%s Message sent @%s... “%s”%n", colorUtils.addBlueColor("[WHATSAPP]"),
                colorUtils.addCyanColor(timeUtils.getTime()), message);
    }
}
