package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3962 {
    private final Productionnull_3962 production = new Productionnull_3962("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}