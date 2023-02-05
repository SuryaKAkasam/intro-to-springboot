package me.suryaakasam.v4.springBoot.message.utilities;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Component
@Qualifier("time24HrsUtils")
public class Time24Hrs implements TimeUtils {
    @Override
    public String getTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss", Locale.ENGLISH);
        return LocalDateTime.now().format(formatter);
    }
}
