package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_295 {
    private final Production63_295 production = new Production63_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}