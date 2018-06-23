package org.pakhomov.services;

import org.springframework.stereotype.Service;

/**
 * Created by fossil on 16.06.18.
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayHello() {
        return HELLO_GURUS;
    }
}
