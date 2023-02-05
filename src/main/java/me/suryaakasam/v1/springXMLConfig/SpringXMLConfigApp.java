package me.suryaakasam.v1.springXMLConfig;

import me.suryaakasam.v1.springXMLConfig.message.controller.MessageController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXMLConfigApp {
    public static void main(String[] args) {
        String configLocation = "file:src/main/java/me/suryaakasam/v1/xmlConfig/ApplicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);

        context.getBean("messenger", MessageController.class).sendMessage("Good morning!");
    }
}