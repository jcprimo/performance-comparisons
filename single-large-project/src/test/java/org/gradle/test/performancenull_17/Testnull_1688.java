package org.gradle.test.performancenull_17;

import static org.junit.Assert.*;

public class Testnull_1688 {
    private final Productionnull_1688 production = new Productionnull_1688("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}