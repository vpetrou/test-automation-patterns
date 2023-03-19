package com.vpetrou.dev.patterns.creational.abstractfactory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;

import static org.junit.jupiter.api.parallel.ExecutionMode.CONCURRENT;

@Execution(CONCURRENT)
public class BrowserFactoryTest {

    Browser browser;

    AbstractFactory browserFactory;

    @BeforeEach
    public void beforeTest() {
        browserFactory = FactoryProducer.getFactory(false);
    }

    @Test
    public void testChrome() {
        browser = browserFactory.getDriver("chrome");
        browser.open();
        browser.visit("https://www.google.com");
    }

    @Test
    public void testEdge() {
        browser = browserFactory.getDriver("edge");
        browser.open();
        browser.visit("https://www.google.com");
    }

    @Test
    public void testFirefox() {
        browser = browserFactory.getDriver("firefox");
        browser.open();
        browser.visit("https://www.google.com");
    }

    @AfterEach
    public void afterTest() {
        browser.quit();
    }


}
