package com.vpetrou.dev.patterns.creational.singleton;

import java.io.*;
import java.net.URL;
import java.util.Properties;

public class ApplicationConfiguration {

    private static ApplicationConfiguration instance = null;

    private Properties properties;

    private ApplicationConfiguration() {
        properties = new Properties();
        URL url = ClassLoader.getSystemResource("config.properties");
        try {
            properties.load(url.openStream());
        } catch (IOException fie) {
            fie.printStackTrace();
        }
    }

    public synchronized static ApplicationConfiguration getInstance() {
        if (instance == null) {
            instance = new ApplicationConfiguration();
        }
        return instance;
    }

    public String getApplicationUrl() {
        return properties.getProperty("app.url");
    }

}
