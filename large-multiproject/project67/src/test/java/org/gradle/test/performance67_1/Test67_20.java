package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_20 {
    private final Production67_20 production = new Production67_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}