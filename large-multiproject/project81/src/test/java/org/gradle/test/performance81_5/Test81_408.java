package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_408 {
    private final Production81_408 production = new Production81_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}