package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5967 {
    private final Productionnull_5967 production = new Productionnull_5967("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}