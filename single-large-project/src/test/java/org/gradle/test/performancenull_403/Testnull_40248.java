package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40248 {
    private final Productionnull_40248 production = new Productionnull_40248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}