package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20090 {
    private final Productionnull_20090 production = new Productionnull_20090("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}