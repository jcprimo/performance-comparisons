package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32462 {
    private final Productionnull_32462 production = new Productionnull_32462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}