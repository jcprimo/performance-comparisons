package org.gradle.test.performancenull_171;

import static org.junit.Assert.*;

public class Testnull_17078 {
    private final Productionnull_17078 production = new Productionnull_17078("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}