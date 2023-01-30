package com.upgrad.spring;

import com.upgrad.spring.coupling.EnglishGreeting;
import com.upgrad.spring.coupling.GreetingServiceFactory;

public class App {
    public static void main(String[] args) {
        /* Tight vs. Loose Coupling */
        runTightCouplingExample();
        runLooseCouplingExample();
    }

    public static void runTightCouplingExample() {
        /*Tight Coupling
          1. The method is tightly coupled with EnglishGreeting class. We can also
             say that this method is dependent on EnglishGreeting.
             runTightCouplingExample() --> dependent
             EnglishGreeting           --> dependency
          2. If the EnglishGreeting gets changed in the future (or) if there is a
             need to switch the current service with an alternate option, this
             method also needs to be updated as well
          3. Tightly coupled processes are relatively harder to test, debug, difficult
             to maintain and are not readily extensible.
         */
        System.out.println("----- From runTightCouplingExample -----");
        EnglishGreeting greetingService = new EnglishGreeting();
        greetingService.greet("Surya");
    }

    private static void runLooseCouplingExample() {
        /*Loose Coupling
          1. This method has now been made loosely coupled with the help of Interfaces
             and the Factory Design Pattern. Note that this method is still dependent on
             the GreetingServiceFactory.
          2. The dependencies (GreetingServiceFactory) can be updated without making
             any change to this method. We can create more greeting services and use
             them without significantly changing the code.
          3. Relatively easier to test, debug and maintain
         */
        System.out.println("----- From runLooseCouplingExample -----");
        GreetingServiceFactory factory = new GreetingServiceFactory();
        factory.getGreetingService("FR").greet("Surya");
        factory.getGreetingService("SP").greet("Surya");
    }
}
