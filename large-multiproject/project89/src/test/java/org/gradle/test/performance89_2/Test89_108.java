package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_108 {
    private final Production89_108 production = new Production89_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}