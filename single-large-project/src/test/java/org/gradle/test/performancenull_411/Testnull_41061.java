package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41061 {
    private final Productionnull_41061 production = new Productionnull_41061("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}