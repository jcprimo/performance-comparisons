package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_136 {
    private final Production83_136 production = new Production83_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}