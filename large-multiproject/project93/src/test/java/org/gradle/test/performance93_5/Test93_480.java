package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_480 {
    private final Production93_480 production = new Production93_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}