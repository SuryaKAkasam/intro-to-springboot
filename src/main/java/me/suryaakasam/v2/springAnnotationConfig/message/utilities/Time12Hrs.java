package me.suryaakasam.v2.springAnnotationConfig.message.utilities;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Component("time12HrsUtils")
public class Time12Hrs implements TimeUtils {
    @Override
    public String getTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("KK:mm a", Locale.ENGLISH);
        return LocalDateTime.now().format(formatter);
    }
}
