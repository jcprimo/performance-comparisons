package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_21 {
    private final Production47_21 production = new Production47_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}