package org.gradle.test.performancenull_418;

import static org.junit.Assert.*;

public class Testnull_41789 {
    private final Productionnull_41789 production = new Productionnull_41789("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}