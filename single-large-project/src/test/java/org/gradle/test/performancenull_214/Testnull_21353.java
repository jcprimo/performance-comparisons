package org.gradle.test.performancenull_214;

import static org.junit.Assert.*;

public class Testnull_21353 {
    private final Productionnull_21353 production = new Productionnull_21353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}