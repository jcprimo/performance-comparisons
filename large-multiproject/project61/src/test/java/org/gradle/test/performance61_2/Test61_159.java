package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_159 {
    private final Production61_159 production = new Production61_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}