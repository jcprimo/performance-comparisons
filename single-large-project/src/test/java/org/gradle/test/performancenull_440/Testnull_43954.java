package org.gradle.test.performancenull_440;

import static org.junit.Assert.*;

public class Testnull_43954 {
    private final Productionnull_43954 production = new Productionnull_43954("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}