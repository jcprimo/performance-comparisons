package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42160 {
    private final Productionnull_42160 production = new Productionnull_42160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}