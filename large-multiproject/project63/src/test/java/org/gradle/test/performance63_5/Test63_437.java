package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_437 {
    private final Production63_437 production = new Production63_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}