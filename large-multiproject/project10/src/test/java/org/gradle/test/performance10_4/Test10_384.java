package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_384 {
    private final Production10_384 production = new Production10_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}