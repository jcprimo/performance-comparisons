package org.gradle.test.performancenull_189;

import static org.junit.Assert.*;

public class Testnull_18802 {
    private final Productionnull_18802 production = new Productionnull_18802("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}