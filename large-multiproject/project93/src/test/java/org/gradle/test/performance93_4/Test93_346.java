package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_346 {
    private final Production93_346 production = new Production93_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}