package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_223 {
    private final Production50_223 production = new Production50_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}