package org.pakhomov.didemo.controllers;

import org.junit.Before;
import org.junit.Test;
import org.pakhomov.services.GreetingService;
import org.pakhomov.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

/**
 * Created by fossil on 16.06.18.
 */
public class SetterInjectedControllerTest {
    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingService.HELLO_GURUS, setterInjectedController.sayHello());
    }
}
