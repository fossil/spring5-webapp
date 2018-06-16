package org.pakhomov.didemo.services;

/**
 * Created by fossil on 16.06.18.
 */
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayHello() {
        return HELLO_GURUS;
    }
}
