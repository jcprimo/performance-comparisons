package org.gradle.test.performancenull_354;

import static org.junit.Assert.*;

public class Testnull_35372 {
    private final Productionnull_35372 production = new Productionnull_35372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}