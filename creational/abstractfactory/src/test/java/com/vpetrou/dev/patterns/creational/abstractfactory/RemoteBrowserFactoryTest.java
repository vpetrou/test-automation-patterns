package com.vpetrou.dev.patterns.creational.abstractfactory;

import org.junit.jupiter.api.*;

@Disabled("No Selenium Grid")
public class RemoteBrowserFactoryTest {

    Browser browser;

    AbstractFactory browserFactory;

    @BeforeEach
    public void beforeTest() {
        browserFactory = FactoryProducer.getFactory(true);
    }

    @Test
    public void testRemoteChrome() {
        browser = browserFactory.getDriver("chrome");
        browser.open();
        browser.visit("https://www.google.com");
    }

    @Test
    public void testRemoteEdge() {
        browser = browserFactory.getDriver("edge");
        browser.open();
        browser.visit("https://www.google.com");
    }

    @Test
    public void testRemoteFirefox() {
        browser = browserFactory.getDriver("firefox");
        browser.open();
        browser.visit("https://www.google.com");
    }

    @AfterEach
    public void afterTest() {
        browser.quit();
    }

}
