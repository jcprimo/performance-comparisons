package org.gradle.test.performancenull_465;

import static org.junit.Assert.*;

public class Testnull_46500 {
    private final Productionnull_46500 production = new Productionnull_46500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}