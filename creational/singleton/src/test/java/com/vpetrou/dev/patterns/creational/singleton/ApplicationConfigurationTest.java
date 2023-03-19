package com.vpetrou.dev.patterns.creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApplicationConfigurationTest {

    @Test
    public void testGetApplicationURL() {
        Assertions.assertEquals(
                "http://localhost:8080",
                ApplicationConfiguration.getInstance().getApplicationUrl()
        );

    }
}
