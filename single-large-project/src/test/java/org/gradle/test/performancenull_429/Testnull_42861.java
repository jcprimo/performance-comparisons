package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42861 {
    private final Productionnull_42861 production = new Productionnull_42861("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}