package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_103 {
    private final Production67_103 production = new Production67_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}