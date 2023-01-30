package com.upgrad.spring.coupling;

public class FrenchGreeting implements Greeting {
    @Override
    public void greet(String arg) {
        System.out.printf("Bonjour, %s!%n", arg);
    }
}
