package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_275 {
    private final Production28_275 production = new Production28_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}