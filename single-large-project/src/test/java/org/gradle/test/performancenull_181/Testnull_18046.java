package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18046 {
    private final Productionnull_18046 production = new Productionnull_18046("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}