package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_203 {
    private final Production16_203 production = new Production16_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}