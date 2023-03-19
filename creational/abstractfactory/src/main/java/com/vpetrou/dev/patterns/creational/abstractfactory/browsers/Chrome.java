package com.vpetrou.dev.patterns.creational.abstractfactory.browsers;

import com.vpetrou.dev.patterns.creational.abstractfactory.Browser;
import com.vpetrou.dev.patterns.creational.abstractfactory.BrowserUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class Chrome extends BrowserUtil implements Browser {

    @Override
    public WebDriver open() {
        SeleniumManager.getInstance().getDriverPath("chromedriver");
        driver = new ChromeDriver();
        return driver;
    }

}
