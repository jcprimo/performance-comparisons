package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_228 {
    private final Production35_228 production = new Production35_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}