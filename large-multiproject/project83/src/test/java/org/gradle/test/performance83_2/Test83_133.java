package org.gradle.test.performance83_2;

import static org.junit.Assert.*;

public class Test83_133 {
    private final Production83_133 production = new Production83_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}