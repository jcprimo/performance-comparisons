package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_83 {
    private final Production18_83 production = new Production18_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}