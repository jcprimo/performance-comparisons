package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_181 {
    private final Production16_181 production = new Production16_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}