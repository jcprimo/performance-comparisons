package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_455 {
    private final Production47_455 production = new Production47_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}