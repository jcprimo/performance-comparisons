package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_473 {
    private final Production90_473 production = new Production90_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}