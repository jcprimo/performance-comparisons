package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9469 {
    private final Productionnull_9469 production = new Productionnull_9469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}