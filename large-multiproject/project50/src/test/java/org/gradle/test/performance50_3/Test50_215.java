package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_215 {
    private final Production50_215 production = new Production50_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}