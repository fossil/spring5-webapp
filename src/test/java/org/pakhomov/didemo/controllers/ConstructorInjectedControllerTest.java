package org.pakhomov.didemo.controllers;

import org.junit.Before;
import org.junit.Test;
import org.pakhomov.didemo.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

/**
 * Created by fossil on 16.06.18.
 */
public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedController.sayHello());
    }
}
