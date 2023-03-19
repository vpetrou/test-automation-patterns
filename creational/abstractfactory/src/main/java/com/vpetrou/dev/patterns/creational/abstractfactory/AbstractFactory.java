package com.vpetrou.dev.patterns.creational.abstractfactory;

public abstract class AbstractFactory {

    abstract Browser getDriver(String browserType);
}
