package org.gradle.test.performancenull_495;

import static org.junit.Assert.*;

public class Testnull_49480 {
    private final Productionnull_49480 production = new Productionnull_49480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}