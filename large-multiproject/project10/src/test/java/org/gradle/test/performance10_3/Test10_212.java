package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_212 {
    private final Production10_212 production = new Production10_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}