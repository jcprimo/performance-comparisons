package org.gradle.test.performancenull_317;

import static org.junit.Assert.*;

public class Testnull_31648 {
    private final Productionnull_31648 production = new Productionnull_31648("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}