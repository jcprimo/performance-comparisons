package org.gradle.test.performancenull_354;

import static org.junit.Assert.*;

public class Testnull_35368 {
    private final Productionnull_35368 production = new Productionnull_35368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}