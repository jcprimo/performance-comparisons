package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47263 {
    private final Productionnull_47263 production = new Productionnull_47263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}