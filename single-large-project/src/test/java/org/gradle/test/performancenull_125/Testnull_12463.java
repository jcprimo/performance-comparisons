package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12463 {
    private final Productionnull_12463 production = new Productionnull_12463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}