package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_299 {
    private final Production14_299 production = new Production14_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}