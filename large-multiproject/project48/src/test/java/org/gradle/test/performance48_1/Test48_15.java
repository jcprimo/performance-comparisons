package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_15 {
    private final Production48_15 production = new Production48_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}