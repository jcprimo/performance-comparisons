package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_171 {
    private final Production54_171 production = new Production54_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}