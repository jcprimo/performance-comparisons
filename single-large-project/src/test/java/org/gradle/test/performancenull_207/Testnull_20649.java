package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20649 {
    private final Productionnull_20649 production = new Productionnull_20649("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}