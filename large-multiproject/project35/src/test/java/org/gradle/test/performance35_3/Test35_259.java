package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_259 {
    private final Production35_259 production = new Production35_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}