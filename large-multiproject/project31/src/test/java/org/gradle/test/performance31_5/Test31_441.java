package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_441 {
    private final Production31_441 production = new Production31_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}