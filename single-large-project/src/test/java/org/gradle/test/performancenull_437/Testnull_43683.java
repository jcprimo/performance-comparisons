package org.gradle.test.performancenull_437;

import static org.junit.Assert.*;

public class Testnull_43683 {
    private final Productionnull_43683 production = new Productionnull_43683("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}