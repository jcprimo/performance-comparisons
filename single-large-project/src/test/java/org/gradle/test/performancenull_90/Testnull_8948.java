package org.gradle.test.performancenull_90;

import static org.junit.Assert.*;

public class Testnull_8948 {
    private final Productionnull_8948 production = new Productionnull_8948("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}