package me.suryaakasam.v2.springAnnotationConfig.message.service;

import me.suryaakasam.v2.springAnnotationConfig.message.utilities.ColorUtils;
import me.suryaakasam.v2.springAnnotationConfig.message.utilities.TimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("whatsapp")
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
