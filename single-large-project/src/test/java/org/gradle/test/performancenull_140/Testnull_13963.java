package org.gradle.test.performancenull_140;

import static org.junit.Assert.*;

public class Testnull_13963 {
    private final Productionnull_13963 production = new Productionnull_13963("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}