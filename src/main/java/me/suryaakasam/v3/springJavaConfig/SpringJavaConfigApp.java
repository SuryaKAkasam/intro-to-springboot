package me.suryaakasam.v3.springJavaConfig;

import me.suryaakasam.v3.springJavaConfig.message.controller.MessageController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringJavaConfigApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        /* The above can be achieved as below
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("me.suryaakasam.v3.javaConfig");
        context.refresh();
         */

        context.getBean(MessageController.class).sendMessage("Good morning!");
    }
}