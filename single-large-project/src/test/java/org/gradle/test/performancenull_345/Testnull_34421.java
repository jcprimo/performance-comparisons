package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34421 {
    private final Productionnull_34421 production = new Productionnull_34421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}