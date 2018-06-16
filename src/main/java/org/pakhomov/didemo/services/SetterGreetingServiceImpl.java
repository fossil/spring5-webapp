package org.pakhomov.didemo.services;

import org.springframework.stereotype.Service;

/**
 * Created by fossil on 16.06.18.
 */
@Service
public class SetterGreetingServiceImpl implements GreetingService {

    @Override
    public String sayHello() {
        return "Hello - I was injected by Setter!";
    }
}
