package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_363 {
    private final Production92_363 production = new Production92_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}