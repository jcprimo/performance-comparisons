package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_117 {
    private final Production19_117 production = new Production19_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}