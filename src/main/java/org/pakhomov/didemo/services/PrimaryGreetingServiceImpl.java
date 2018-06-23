package org.pakhomov.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by fossil on 16.06.18.
 */
@Service
@Primary
public class PrimaryGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello - Primary Greeting Service!!!";
    }
}
