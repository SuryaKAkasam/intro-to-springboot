package me.suryaakasam.v4.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("me.suryaakasam.v4.springBoot")
public class SpringBootApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootApp.class, args);

        System.out.println("[[ Messenger Beans ]]");
        for (String beanName : context.getBeanDefinitionNames())
            if (beanName.endsWith("Messenger"))
                System.out.println("  * " + beanName);
    }
}