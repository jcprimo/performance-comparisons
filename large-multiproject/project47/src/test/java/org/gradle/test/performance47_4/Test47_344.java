package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_344 {
    private final Production47_344 production = new Production47_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}