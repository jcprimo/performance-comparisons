package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_149 {
    private final Production20_149 production = new Production20_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}