package org.gradle.test.performancenull_376;

import static org.junit.Assert.*;

public class Testnull_37531 {
    private final Productionnull_37531 production = new Productionnull_37531("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}