package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_455 {
    private final Production63_455 production = new Production63_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}