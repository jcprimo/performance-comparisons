package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_195 {
    private final Production28_195 production = new Production28_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}