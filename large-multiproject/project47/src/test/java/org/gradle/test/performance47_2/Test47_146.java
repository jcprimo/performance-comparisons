package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_146 {
    private final Production47_146 production = new Production47_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}