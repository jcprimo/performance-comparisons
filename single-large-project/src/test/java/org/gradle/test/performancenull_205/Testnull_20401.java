package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20401 {
    private final Productionnull_20401 production = new Productionnull_20401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}