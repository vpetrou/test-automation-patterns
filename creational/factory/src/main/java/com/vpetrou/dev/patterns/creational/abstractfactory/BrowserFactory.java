package com.vpetrou.dev.patterns.creational.abstractfactory;

import com.vpetrou.dev.patterns.creational.abstractfactory.browsers.Chrome;
import com.vpetrou.dev.patterns.creational.abstractfactory.browsers.Edge;
import com.vpetrou.dev.patterns.creational.abstractfactory.browsers.Firefox;

public class BrowserFactory {

    public Browser getDriver(String browserType) {
        if (browserType == null) {
            return null;
        }
        if (browserType.equalsIgnoreCase("chrome")) {
            return new Chrome();

        } else if (browserType.equalsIgnoreCase("edge")) {
            return new Edge();

        } else if (browserType.equalsIgnoreCase("firefox")) {
            return new Firefox();
        }
        return null;
    }

}
