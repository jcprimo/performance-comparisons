package org.gradle.test.performancenull_489;

import static org.junit.Assert.*;

public class Testnull_48845 {
    private final Productionnull_48845 production = new Productionnull_48845("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}