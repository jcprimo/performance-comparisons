package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_300 {
    private final Production93_300 production = new Production93_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}