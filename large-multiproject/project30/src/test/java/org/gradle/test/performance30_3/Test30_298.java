package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_298 {
    private final Production30_298 production = new Production30_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}