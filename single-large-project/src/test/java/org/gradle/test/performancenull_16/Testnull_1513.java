package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1513 {
    private final Productionnull_1513 production = new Productionnull_1513("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}