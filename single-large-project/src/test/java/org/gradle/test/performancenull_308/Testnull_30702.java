package org.gradle.test.performancenull_308;

import static org.junit.Assert.*;

public class Testnull_30702 {
    private final Productionnull_30702 production = new Productionnull_30702("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}