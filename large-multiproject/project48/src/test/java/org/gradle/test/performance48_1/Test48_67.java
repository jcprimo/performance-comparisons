package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_67 {
    private final Production48_67 production = new Production48_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}