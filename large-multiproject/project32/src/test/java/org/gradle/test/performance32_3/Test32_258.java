package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_258 {
    private final Production32_258 production = new Production32_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}