package org.gradle.test.performancenull_65;

import static org.junit.Assert.*;

public class Testnull_6481 {
    private final Productionnull_6481 production = new Productionnull_6481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}