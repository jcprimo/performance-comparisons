package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_30 {
    private final Production54_30 production = new Production54_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}