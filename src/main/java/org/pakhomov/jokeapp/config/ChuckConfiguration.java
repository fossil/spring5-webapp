package org.pakhomov.jokeapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.pakhomov.jokeapp.service.JokeService;
import org.pakhomov.jokeapp.service.JokeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by fossil on 23.06.18.
 */
//@Configuration
public class ChuckConfiguration {

//    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
