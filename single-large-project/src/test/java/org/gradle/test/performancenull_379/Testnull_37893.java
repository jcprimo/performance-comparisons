package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37893 {
    private final Productionnull_37893 production = new Productionnull_37893("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}