package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_233 {
    private final Production32_233 production = new Production32_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}