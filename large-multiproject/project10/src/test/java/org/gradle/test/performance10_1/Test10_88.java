package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_88 {
    private final Production10_88 production = new Production10_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}