package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11906 {
    private final Productionnull_11906 production = new Productionnull_11906("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}