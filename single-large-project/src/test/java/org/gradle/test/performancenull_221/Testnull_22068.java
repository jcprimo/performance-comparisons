package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22068 {
    private final Productionnull_22068 production = new Productionnull_22068("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}