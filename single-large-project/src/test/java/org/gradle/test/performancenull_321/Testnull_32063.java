package org.gradle.test.performancenull_321;

import static org.junit.Assert.*;

public class Testnull_32063 {
    private final Productionnull_32063 production = new Productionnull_32063("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}