package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_399 {
    private final Production84_399 production = new Production84_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}