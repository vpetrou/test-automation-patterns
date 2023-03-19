package com.vpetrou.dev.patterns.creational.abstractfactory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class BrowserFactoryTest {

    Browser browser;

    @Test
    public void testChrome() {
        browser = new BrowserFactory().getDriver("chrome");
        browser.open();
        browser.visit("https://www.google.com");
    }

    @Test
    public void testEdge() {
        browser = new BrowserFactory().getDriver("edge");
        browser.open();
        browser.visit("https://www.google.com");
    }

    @Test
    public void testFirefox() {
        browser = new BrowserFactory().getDriver("firefox");
        browser.open();
        browser.visit("https://www.google.com");
    }

    @AfterEach
    public void afterTest() {
        browser.quit();
    }
}
