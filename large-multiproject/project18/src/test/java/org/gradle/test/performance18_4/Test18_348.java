package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_348 {
    private final Production18_348 production = new Production18_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}