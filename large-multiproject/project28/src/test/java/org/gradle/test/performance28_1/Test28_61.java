package org.gradle.test.performance28_1;

import static org.junit.Assert.*;

public class Test28_61 {
    private final Production28_61 production = new Production28_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}