package me.suryaakasam.v3.springJavaConfig.message.service;

import me.suryaakasam.v3.springJavaConfig.message.utilities.ColorUtils;
import me.suryaakasam.v3.springJavaConfig.message.utilities.TimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

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
