package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_387 {
    private final Production54_387 production = new Production54_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}