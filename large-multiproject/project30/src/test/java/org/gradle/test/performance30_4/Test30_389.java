package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_389 {
    private final Production30_389 production = new Production30_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}