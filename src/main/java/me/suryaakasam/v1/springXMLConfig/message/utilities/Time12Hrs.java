package me.suryaakasam.v1.springXMLConfig.message.utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Time12Hrs implements TimeUtils {
    @Override
    public String getTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("KK:mm a", Locale.ENGLISH);
        return LocalDateTime.now().format(formatter);
    }
}
