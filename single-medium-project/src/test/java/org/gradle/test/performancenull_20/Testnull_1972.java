package org.gradle.test.performancenull_20;

import static org.junit.Assert.*;

public class Testnull_1972 {
    private final Productionnull_1972 production = new Productionnull_1972("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}