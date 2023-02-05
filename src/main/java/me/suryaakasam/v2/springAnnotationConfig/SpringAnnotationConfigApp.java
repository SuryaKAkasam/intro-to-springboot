package me.suryaakasam.v2.springAnnotationConfig;

import me.suryaakasam.v2.springAnnotationConfig.message.controller.MessageController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationConfigApp {
    public static void main(String[] args) {
        String configLocation = "file:src/main/java/me/suryaakasam/v2/annotationConfig/ApplicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);

        /* The above can also be achieved using the following invocation
        ApplicationContext context = new AnnotationConfigApplicationContext("me.suryaakasam.v2.annotationConfig");
        */

        context.getBean(MessageController.class).sendMessage("Good morning!");
    }
}