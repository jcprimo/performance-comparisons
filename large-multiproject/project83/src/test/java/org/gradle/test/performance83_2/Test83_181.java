package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_181 {
    private final Production83_181 production = new Production83_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}