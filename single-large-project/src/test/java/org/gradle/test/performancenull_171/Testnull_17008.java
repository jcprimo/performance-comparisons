package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17008 {
    private final Productionnull_17008 production = new Productionnull_17008("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}