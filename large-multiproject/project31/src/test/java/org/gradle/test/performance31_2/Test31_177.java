package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_177 {
    private final Production31_177 production = new Production31_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}