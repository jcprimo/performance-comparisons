package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_240 {
    private final Production67_240 production = new Production67_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}