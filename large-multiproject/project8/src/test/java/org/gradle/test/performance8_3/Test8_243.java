package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_243 {
    private final Production8_243 production = new Production8_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}