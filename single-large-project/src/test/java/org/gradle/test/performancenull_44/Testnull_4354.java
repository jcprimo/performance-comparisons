package org.gradle.test.performancenull_44;

import static org.junit.Assert.*;

public class Testnull_4354 {
    private final Productionnull_4354 production = new Productionnull_4354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}