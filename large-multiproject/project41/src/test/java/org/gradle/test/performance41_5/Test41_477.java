package org.gradle.test.performance41_5;

import static org.junit.Assert.*;

public class Test41_477 {
    private final Production41_477 production = new Production41_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}