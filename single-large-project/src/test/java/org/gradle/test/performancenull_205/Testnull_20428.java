package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20428 {
    private final Productionnull_20428 production = new Productionnull_20428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}