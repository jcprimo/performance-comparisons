package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_463 {
    private final Production50_463 production = new Production50_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}