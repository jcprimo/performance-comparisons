package org.gradle.test.performancenull_316;

import static org.junit.Assert.*;

public class Testnull_31566 {
    private final Productionnull_31566 production = new Productionnull_31566("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}