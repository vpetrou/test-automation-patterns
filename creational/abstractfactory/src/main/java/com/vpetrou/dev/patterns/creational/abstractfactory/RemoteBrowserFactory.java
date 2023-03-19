package com.vpetrou.dev.patterns.creational.abstractfactory;

import com.vpetrou.dev.patterns.creational.abstractfactory.browsers.RemoteChrome;
import com.vpetrou.dev.patterns.creational.abstractfactory.browsers.RemoteEdge;
import com.vpetrou.dev.patterns.creational.abstractfactory.browsers.RemoteFirefox;

public class RemoteBrowserFactory extends AbstractFactory {

    @Override
    public Browser getDriver(String browserType) {
        if (browserType == null) {
            return null;
        }
        if (browserType.equalsIgnoreCase("chrome")) {
            return new RemoteChrome();

        } else if (browserType.equalsIgnoreCase("edge")) {
            return new RemoteEdge();

        } else if (browserType.equalsIgnoreCase("firefox")) {
            return new RemoteFirefox();
        }
        return null;
    }

}
