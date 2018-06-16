package org.pakhomov.didemo.controllers;

import org.pakhomov.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by fossil on 16.06.18.
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayHello();
    }
}
