package org.gradle.test.performancenull_313;

import static org.junit.Assert.*;

public class Testnull_31259 {
    private final Productionnull_31259 production = new Productionnull_31259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}