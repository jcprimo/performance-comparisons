package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_186 {
    private final Production80_186 production = new Production80_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}