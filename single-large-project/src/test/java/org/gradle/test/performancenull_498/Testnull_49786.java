package org.gradle.test.performancenull_498;

import static org.junit.Assert.*;

public class Testnull_49786 {
    private final Productionnull_49786 production = new Productionnull_49786("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}