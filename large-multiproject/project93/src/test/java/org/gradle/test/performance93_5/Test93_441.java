package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_441 {
    private final Production93_441 production = new Production93_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}