package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4967 {
    private final Productionnull_4967 production = new Productionnull_4967("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}