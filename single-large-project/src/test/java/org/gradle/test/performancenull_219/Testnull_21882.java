package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21882 {
    private final Productionnull_21882 production = new Productionnull_21882("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}