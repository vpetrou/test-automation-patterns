package com.vpetrou.dev.patterns.creational.abstractfactory;

import org.openqa.selenium.WebDriver;

public class BrowserUtil {

    protected WebDriver driver;

    public void visit(String url) {
        driver.get(url);
    }

    public void quit() {
        driver.quit();
    }
}
