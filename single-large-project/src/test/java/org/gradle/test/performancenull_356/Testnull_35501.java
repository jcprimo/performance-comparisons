package org.gradle.test.performancenull_356;

import static org.junit.Assert.*;

public class Testnull_35501 {
    private final Productionnull_35501 production = new Productionnull_35501("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}