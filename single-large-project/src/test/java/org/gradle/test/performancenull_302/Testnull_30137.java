package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30137 {
    private final Productionnull_30137 production = new Productionnull_30137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}