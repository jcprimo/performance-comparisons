package org.gradle.test.performancenull_414;

import static org.junit.Assert.*;

public class Testnull_41386 {
    private final Productionnull_41386 production = new Productionnull_41386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}