package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_497 {
    private final Production63_497 production = new Production63_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}