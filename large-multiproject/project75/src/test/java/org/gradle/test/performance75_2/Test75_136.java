package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_136 {
    private final Production75_136 production = new Production75_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}