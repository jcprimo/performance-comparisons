package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_3 {
    private final Production31_3 production = new Production31_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}