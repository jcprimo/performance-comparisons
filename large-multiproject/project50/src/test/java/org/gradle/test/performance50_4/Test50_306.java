package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_306 {
    private final Production50_306 production = new Production50_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}