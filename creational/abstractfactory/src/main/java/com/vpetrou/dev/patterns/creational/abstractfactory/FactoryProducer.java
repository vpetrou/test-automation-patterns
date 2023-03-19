package com.vpetrou.dev.patterns.creational.abstractfactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(boolean isRemote) {
        if (isRemote) {
            return new RemoteBrowserFactory();
        } else {
            return new BrowserFactory();
        }
    }

}
