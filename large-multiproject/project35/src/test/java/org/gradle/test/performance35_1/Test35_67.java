package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_67 {
    private final Production35_67 production = new Production35_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}