package org.gradle.test.performancenull_450;

import static org.junit.Assert.*;

public class Testnull_44901 {
    private final Productionnull_44901 production = new Productionnull_44901("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}