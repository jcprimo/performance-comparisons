package org.gradle.test.performancenull_189;

import static org.junit.Assert.*;

public class Testnull_18801 {
    private final Productionnull_18801 production = new Productionnull_18801("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}