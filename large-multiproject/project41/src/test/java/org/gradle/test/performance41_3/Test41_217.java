package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_217 {
    private final Production41_217 production = new Production41_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}