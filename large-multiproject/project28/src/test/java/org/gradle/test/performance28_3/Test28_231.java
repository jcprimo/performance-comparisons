package org.gradle.test.performance28_3;

import static org.junit.Assert.*;

public class Test28_231 {
    private final Production28_231 production = new Production28_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}