package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_109 {
    private final Production35_109 production = new Production35_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}