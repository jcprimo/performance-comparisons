package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_109 {
    private final Production84_109 production = new Production84_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}