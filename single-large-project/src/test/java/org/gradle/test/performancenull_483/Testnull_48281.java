package org.gradle.test.performancenull_483;

import static org.junit.Assert.*;

public class Testnull_48281 {
    private final Productionnull_48281 production = new Productionnull_48281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}