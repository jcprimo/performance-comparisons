package org.gradle.test.performancenull_48;

import static org.junit.Assert.*;

public class Testnull_4742 {
    private final Productionnull_4742 production = new Productionnull_4742("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}