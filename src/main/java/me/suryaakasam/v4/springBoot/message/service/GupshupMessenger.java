package me.suryaakasam.v4.springBoot.message.service;

import me.suryaakasam.v4.springBoot.message.utilities.ColorUtils;
import me.suryaakasam.v4.springBoot.message.utilities.TimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"qa"})
@Qualifier("gupshupMessenger")
public class GupshupMessenger implements MessageService {
    private ColorUtils colorUtils;
    private TimeUtils timeUtils;

    public ColorUtils getColorUtils() {
        return colorUtils;
    }

    @Autowired
    public void setColorUtils(ColorUtils colorUtils) {
        this.colorUtils = colorUtils;
    }

    public TimeUtils getTimeUtils() {
        return timeUtils;
    }

    @Autowired
    public void setTimeUtils(@Qualifier("time12HrsUtils") TimeUtils timeUtils) {
        this.timeUtils = timeUtils;
    }

    @Override
    public void send(String message) {
        System.out.printf("%s Message sent @%s... ā%sā%n", colorUtils.addGreenColor("[GUPSHUP ]"),
                colorUtils.addCyanColor(timeUtils.getTime()), message);
    }
}
