package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_197 {
    private final Production10_197 production = new Production10_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}