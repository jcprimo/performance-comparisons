package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_117 {
    private final Production72_117 production = new Production72_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}