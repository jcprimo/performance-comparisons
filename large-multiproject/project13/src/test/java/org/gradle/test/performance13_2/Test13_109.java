package org.gradle.test.performance13_2;

import static org.junit.Assert.*;

public class Test13_109 {
    private final Production13_109 production = new Production13_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}