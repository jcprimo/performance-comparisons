package org.gradle.test.performancenull_225;

import static org.junit.Assert.*;

public class Testnull_22484 {
    private final Productionnull_22484 production = new Productionnull_22484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}