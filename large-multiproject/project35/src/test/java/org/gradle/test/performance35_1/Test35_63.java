package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_63 {
    private final Production35_63 production = new Production35_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}