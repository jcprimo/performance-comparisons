package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_351 {
    private final Production22_351 production = new Production22_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}