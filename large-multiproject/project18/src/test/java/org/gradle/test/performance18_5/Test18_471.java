package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_471 {
    private final Production18_471 production = new Production18_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}