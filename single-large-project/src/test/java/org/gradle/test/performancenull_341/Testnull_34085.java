package org.gradle.test.performancenull_341;

import static org.junit.Assert.*;

public class Testnull_34085 {
    private final Productionnull_34085 production = new Productionnull_34085("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}