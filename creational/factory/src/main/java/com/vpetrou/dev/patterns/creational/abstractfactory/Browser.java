package com.vpetrou.dev.patterns.creational.abstractfactory;

import org.openqa.selenium.WebDriver;

public interface Browser {

    WebDriver open();

    void visit(String url);

    void quit();
}
