package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_264 {
    private final Production31_264 production = new Production31_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}