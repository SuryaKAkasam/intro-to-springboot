package com.upgrad.spring.coupling;

public class GreetingServiceFactory {
    public Greeting getGreetingService(String language) {
        if (language.equals("EN")) return new EnglishGreeting();
        else if (language.equals("FR")) return new FrenchGreeting();
        else if (language.equals("SP")) return new SpanishGreeting();
        else throw new RuntimeException("No greeting service available for " + language + " language");
    }
}
