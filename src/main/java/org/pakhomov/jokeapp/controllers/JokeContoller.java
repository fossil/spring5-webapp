package org.pakhomov.jokeapp.controllers;

import org.pakhomov.jokeapp.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by fossil on 23.06.18.
 */
@Controller
public class JokeContoller {

    JokeService jokeService;

    public JokeContoller(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());

        return "chucknorris";
    }
}
