package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21769 {
    private final Productionnull_21769 production = new Productionnull_21769("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}