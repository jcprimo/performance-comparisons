package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_110 {
    private final Production13_110 production = new Production13_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}