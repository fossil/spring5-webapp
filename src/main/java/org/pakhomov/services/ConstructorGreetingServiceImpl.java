package org.pakhomov.services;

import org.springframework.stereotype.Service;

/**
 * Created by fossil on 16.06.18.
 */
@Service
public class ConstructorGreetingServiceImpl implements GreetingService {

    @Override
    public String sayHello() {
        return "Hello - I was injected via the Constructor!";
    }
}
