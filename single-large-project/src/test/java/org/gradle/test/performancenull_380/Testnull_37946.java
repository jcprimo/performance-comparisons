package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37946 {
    private final Productionnull_37946 production = new Productionnull_37946("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}