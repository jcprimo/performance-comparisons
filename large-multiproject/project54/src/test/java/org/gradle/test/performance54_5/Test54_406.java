package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_406 {
    private final Production54_406 production = new Production54_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}