package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42188 {
    private final Productionnull_42188 production = new Productionnull_42188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}