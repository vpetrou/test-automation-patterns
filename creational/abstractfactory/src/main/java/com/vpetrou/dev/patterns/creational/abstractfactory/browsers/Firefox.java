package com.vpetrou.dev.patterns.creational.abstractfactory.browsers;

import com.vpetrou.dev.patterns.creational.abstractfactory.Browser;
import com.vpetrou.dev.patterns.creational.abstractfactory.BrowserUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class Firefox extends BrowserUtil implements Browser {

    @Override
    public WebDriver open() {
        SeleniumManager.getInstance().getDriverPath("geckodriver");
        driver = new FirefoxDriver();
        return driver;
    }

}
