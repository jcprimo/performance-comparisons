package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25454 {
    private final Productionnull_25454 production = new Productionnull_25454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}