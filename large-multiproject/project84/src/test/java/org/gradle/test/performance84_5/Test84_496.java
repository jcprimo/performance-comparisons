package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_496 {
    private final Production84_496 production = new Production84_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}