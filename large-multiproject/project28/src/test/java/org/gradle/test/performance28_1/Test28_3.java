package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_3 {
    private final Production28_3 production = new Production28_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}