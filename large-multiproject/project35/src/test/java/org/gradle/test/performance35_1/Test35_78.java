package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_78 {
    private final Production35_78 production = new Production35_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}