package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_468 {
    private final Production16_468 production = new Production16_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}