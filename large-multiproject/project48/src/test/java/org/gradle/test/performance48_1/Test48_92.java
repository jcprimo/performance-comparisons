package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_92 {
    private final Production48_92 production = new Production48_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}