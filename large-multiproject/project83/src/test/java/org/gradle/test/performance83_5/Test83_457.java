package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_457 {
    private final Production83_457 production = new Production83_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}