package org.gradle.test.performancenull_35;

import static org.junit.Assert.*;

public class Testnull_3480 {
    private final Productionnull_3480 production = new Productionnull_3480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}