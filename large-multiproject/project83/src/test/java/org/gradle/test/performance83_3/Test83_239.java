package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_239 {
    private final Production83_239 production = new Production83_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}