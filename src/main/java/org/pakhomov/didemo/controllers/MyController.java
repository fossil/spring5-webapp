package org.pakhomov.didemo.controllers;

import org.pakhomov.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by fossil on 16.06.18.
 */
@Controller
public class MyController {
    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("Hello!");
        return greetingService.sayHello();
    }
}
