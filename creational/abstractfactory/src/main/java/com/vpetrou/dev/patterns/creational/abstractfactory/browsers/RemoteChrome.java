package com.vpetrou.dev.patterns.creational.abstractfactory.browsers;

import com.vpetrou.dev.patterns.creational.abstractfactory.Browser;
import com.vpetrou.dev.patterns.creational.abstractfactory.BrowserUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteChrome extends BrowserUtil implements Browser {

    @Override
    public WebDriver open() {
        SeleniumManager.getInstance().getDriverPath("chromedriver");
        try {
            driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444"), new ChromeOptions());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }

}
