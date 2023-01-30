package com.upgrad.spring.coupling;

public class SpanishGreeting implements Greeting {
    @Override
    public void greet(String arg) {
        System.out.printf("Hola, %s!%n", arg);
    }
}
