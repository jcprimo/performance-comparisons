package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_60 {
    private final Production47_60 production = new Production47_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}