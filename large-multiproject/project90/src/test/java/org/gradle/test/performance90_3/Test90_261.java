package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_261 {
    private final Production90_261 production = new Production90_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}