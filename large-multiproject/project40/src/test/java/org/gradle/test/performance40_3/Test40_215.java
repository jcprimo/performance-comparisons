package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_215 {
    private final Production40_215 production = new Production40_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}