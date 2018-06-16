package org.pakhomov.didemo.controllers;

import org.pakhomov.didemo.services.GreetingServiceImpl;

/**
 * Created by fossil on 16.06.18.
 */
public class PropertyInjectedController {
    public GreetingServiceImpl greetingService;

    String sayHello() {
        return greetingService.sayHello();
    }
}
