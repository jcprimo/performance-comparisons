package org.gradle.test.performancenull_102;

import static org.junit.Assert.*;

public class Testnull_10154 {
    private final Productionnull_10154 production = new Productionnull_10154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}