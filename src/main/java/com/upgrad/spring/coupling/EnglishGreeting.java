package com.upgrad.spring.coupling;

public class EnglishGreeting implements Greeting {
    @Override
    public void greet(String arg) {
        System.out.printf("Hello, %s!%n", arg);
    }
}
