package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25997 {
    private final Productionnull_25997 production = new Productionnull_25997("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}