package org.gradle.test.performancenull_275;

import static org.junit.Assert.*;

public class Testnull_27442 {
    private final Productionnull_27442 production = new Productionnull_27442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}