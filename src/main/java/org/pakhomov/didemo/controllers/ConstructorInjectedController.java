package org.pakhomov.didemo.controllers;

import org.pakhomov.didemo.services.GreetingService;

/**
 * Created by fossil on 16.06.18.
 */
public class ConstructorInjectedController {
    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String sayHello() {
        return greetingService.sayHello();
    }
}
