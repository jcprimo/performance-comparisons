package org.gradle.test.performance22_3;

import static org.junit.Assert.*;

public class Test22_273 {
    private final Production22_273 production = new Production22_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}