package org.gradle.test.performancenull_110;

import static org.junit.Assert.*;

public class Testnull_10976 {
    private final Productionnull_10976 production = new Productionnull_10976("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}