package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_116 {
    private final Production83_116 production = new Production83_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}