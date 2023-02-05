package me.suryaakasam.v0.nonSpringImpl.message.factory;

import me.suryaakasam.v0.nonSpringImpl.message.utilities.ColorUtils;
import me.suryaakasam.v0.nonSpringImpl.message.service.MessageService;
import me.suryaakasam.v0.nonSpringImpl.message.service.GupshupMessenger;
import me.suryaakasam.v0.nonSpringImpl.message.service.TelegramMessenger;
import me.suryaakasam.v0.nonSpringImpl.message.service.WhatsappMessenger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class MessageFactory {
    public final static int WHATSAPP_MESSENGER = 1;
    public final static int TELEGRAM_MESSENGER = 2;
    public final static int GUPSHUP_MESSENGER = 3;

    @SuppressWarnings("unchecked")
    public MessageService getMessageService(int messengerType) {
        ColorUtils colorUtils = new ColorUtils();

        if (messengerType == WHATSAPP_MESSENGER) {
            WhatsappMessenger whatsappMessenger = null;
            Class<WhatsappMessenger> clazz = WhatsappMessenger.class;
            Constructor<WhatsappMessenger>[] constructors = (Constructor<WhatsappMessenger>[]) clazz.getConstructors();

            for (Constructor<?> c : constructors) {
                if (c.getParameterCount() == 0) //Default Constructor
                {
                    try {
                        whatsappMessenger = (WhatsappMessenger) c.newInstance(); //Create Instance
                    } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

            Field colorUtilsField;
            try {
                colorUtilsField = clazz.getDeclaredField("colorUtils");
                colorUtilsField.setAccessible(true);
                colorUtilsField.set(whatsappMessenger, colorUtils); //Inject Dependency
            } catch (NoSuchFieldException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }

            return whatsappMessenger;
        }
        else if (messengerType == TELEGRAM_MESSENGER) {
            return new TelegramMessenger(colorUtils);
        }
        else if (messengerType == GUPSHUP_MESSENGER) {
            GupshupMessenger gupshupMessenger = new GupshupMessenger();
            gupshupMessenger.setColorUtils(colorUtils);
            return gupshupMessenger;
        }
        else {
            throw new RuntimeException("Exception! Unknown messenger service requested");
        }
    }
}
