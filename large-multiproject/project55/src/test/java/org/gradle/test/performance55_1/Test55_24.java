package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_24 {
    private final Production55_24 production = new Production55_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}