package org.gradle.test.performancenull_454;

import static org.junit.Assert.*;

public class Testnull_45384 {
    private final Productionnull_45384 production = new Productionnull_45384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}