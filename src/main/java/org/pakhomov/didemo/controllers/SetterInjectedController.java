package org.pakhomov.didemo.controllers;

import org.pakhomov.didemo.services.GreetingService;

/**
 * Created by fossil on 16.06.18.
 */
public class SetterInjectedController {
    private GreetingService greetingService;

    String sayHello() {
        return greetingService.sayHello();
    }

    public void setGreetingService(GreetingService greetingService) { this.greetingService = greetingService; }
}
