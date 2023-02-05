package me.suryaakasam.v3.springJavaConfig;

import me.suryaakasam.v3.springJavaConfig.message.controller.MessageController;
import me.suryaakasam.v3.springJavaConfig.message.service.MessageService;
import me.suryaakasam.v3.springJavaConfig.message.service.WhatsappMessenger;
import me.suryaakasam.v3.springJavaConfig.message.utilities.ColorUtils;
import me.suryaakasam.v3.springJavaConfig.message.utilities.Time12Hrs;
import me.suryaakasam.v3.springJavaConfig.message.utilities.Time24Hrs;
import me.suryaakasam.v3.springJavaConfig.message.utilities.TimeUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public ColorUtils colorUtils() {
        return new ColorUtils();
    }

    @Bean("time12HrsUtils")
    public TimeUtils time12HrUtils() {
        return new Time12Hrs();
    }

    @Bean("time24HrsUtils")
    public TimeUtils time24HrUtils() {
        return new Time24Hrs();
    }

    @Bean
    public MessageController messageController() {
        return new MessageController();
    }

    @Bean("whatsapp")
    public MessageService whatsapp() {
        return new WhatsappMessenger();
    }

    @Bean("telegram")
    public MessageService telegram() {
        return new WhatsappMessenger();
    }

    @Bean("gupshup")
    public MessageService gupshup() {
        return new WhatsappMessenger();
    }
}
