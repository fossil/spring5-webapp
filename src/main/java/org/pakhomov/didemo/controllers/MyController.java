package org.pakhomov.didemo.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by fossil on 16.06.18.
 */
@Controller
public class MyController {
    public String hello() {
        System.out.println("Hello!");
        return "hello";
    }
}
