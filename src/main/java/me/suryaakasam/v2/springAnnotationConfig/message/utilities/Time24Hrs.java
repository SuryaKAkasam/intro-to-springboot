package me.suryaakasam.v2.springAnnotationConfig.message.utilities;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Component("time24HrsUtils")
public class Time24Hrs implements TimeUtils {
    @Override
    public String getTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss", Locale.ENGLISH);
        return LocalDateTime.now().format(formatter);
    }
}
