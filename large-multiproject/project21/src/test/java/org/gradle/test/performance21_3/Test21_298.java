package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_298 {
    private final Production21_298 production = new Production21_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}