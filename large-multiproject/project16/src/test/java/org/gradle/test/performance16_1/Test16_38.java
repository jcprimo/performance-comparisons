package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_38 {
    private final Production16_38 production = new Production16_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}