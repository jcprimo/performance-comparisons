package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3936 {
    private final Productionnull_3936 production = new Productionnull_3936("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}