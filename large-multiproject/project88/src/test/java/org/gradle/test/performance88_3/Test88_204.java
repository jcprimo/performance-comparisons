package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_204 {
    private final Production88_204 production = new Production88_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}