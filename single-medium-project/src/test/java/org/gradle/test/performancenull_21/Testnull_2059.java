package org.gradle.test.performancenull_21;

import static org.junit.Assert.*;

public class Testnull_2059 {
    private final Productionnull_2059 production = new Productionnull_2059("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}