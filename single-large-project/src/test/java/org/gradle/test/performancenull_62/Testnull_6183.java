package org.gradle.test.performancenull_62;

import static org.junit.Assert.*;

public class Testnull_6183 {
    private final Productionnull_6183 production = new Productionnull_6183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}