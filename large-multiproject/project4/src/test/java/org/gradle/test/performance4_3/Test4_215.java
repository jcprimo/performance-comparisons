package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_215 {
    private final Production4_215 production = new Production4_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}