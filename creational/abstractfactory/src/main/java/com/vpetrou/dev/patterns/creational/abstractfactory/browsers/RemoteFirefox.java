package com.vpetrou.dev.patterns.creational.abstractfactory.browsers;

import com.vpetrou.dev.patterns.creational.abstractfactory.Browser;
import com.vpetrou.dev.patterns.creational.abstractfactory.BrowserUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteFirefox extends BrowserUtil implements Browser {

    @Override
    public WebDriver open() {
        SeleniumManager.getInstance().getDriverPath("geckodriver");
        try {
            driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444"), new FirefoxOptions());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }

}
