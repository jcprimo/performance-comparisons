package org.gradle.test.performancenull_223;

import static org.junit.Assert.*;

public class Testnull_22282 {
    private final Productionnull_22282 production = new Productionnull_22282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}