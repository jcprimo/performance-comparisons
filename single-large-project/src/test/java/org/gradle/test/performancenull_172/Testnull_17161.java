package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17161 {
    private final Productionnull_17161 production = new Productionnull_17161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}