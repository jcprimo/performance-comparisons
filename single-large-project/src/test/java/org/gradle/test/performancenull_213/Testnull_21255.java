package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21255 {
    private final Productionnull_21255 production = new Productionnull_21255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}