package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21383 {
    private final Productionnull_21383 production = new Productionnull_21383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}