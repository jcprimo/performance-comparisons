package org.gradle.test.performancenull_203;

import static org.junit.Assert.*;

public class Testnull_20287 {
    private final Productionnull_20287 production = new Productionnull_20287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}