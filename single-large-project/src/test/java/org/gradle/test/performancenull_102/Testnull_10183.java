package org.gradle.test.performancenull_102;

import static org.junit.Assert.*;

public class Testnull_10183 {
    private final Productionnull_10183 production = new Productionnull_10183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}