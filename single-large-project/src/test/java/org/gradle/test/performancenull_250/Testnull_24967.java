package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24967 {
    private final Productionnull_24967 production = new Productionnull_24967("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}