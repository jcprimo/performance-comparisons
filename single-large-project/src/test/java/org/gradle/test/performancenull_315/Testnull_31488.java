package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31488 {
    private final Productionnull_31488 production = new Productionnull_31488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}