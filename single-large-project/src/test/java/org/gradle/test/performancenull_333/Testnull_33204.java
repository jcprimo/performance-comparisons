package org.gradle.test.performancenull_333;

import static org.junit.Assert.*;

public class Testnull_33204 {
    private final Productionnull_33204 production = new Productionnull_33204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}