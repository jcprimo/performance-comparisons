package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14942 {
    private final Productionnull_14942 production = new Productionnull_14942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}