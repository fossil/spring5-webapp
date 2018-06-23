package org.pakhomov.didemo.controllers;

import org.junit.Before;
import org.junit.Test;
import org.pakhomov.services.GreetingService;
import org.pakhomov.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

/**
 * Created by fossil on 16.06.18.
 */
public class PropertyInjectedControllerTest {
    PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingService.HELLO_GURUS, propertyInjectedController.sayHello());
    }
}
