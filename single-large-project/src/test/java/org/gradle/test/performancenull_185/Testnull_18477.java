package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18477 {
    private final Productionnull_18477 production = new Productionnull_18477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}