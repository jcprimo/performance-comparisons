package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_79 {
    private final Production40_79 production = new Production40_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}