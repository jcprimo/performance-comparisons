package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_308 {
    private final Production93_308 production = new Production93_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}