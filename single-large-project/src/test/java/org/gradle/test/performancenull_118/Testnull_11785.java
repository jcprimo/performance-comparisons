package org.gradle.test.performancenull_118;

import static org.junit.Assert.*;

public class Testnull_11785 {
    private final Productionnull_11785 production = new Productionnull_11785("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}