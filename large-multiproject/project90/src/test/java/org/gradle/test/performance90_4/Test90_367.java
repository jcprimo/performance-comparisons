package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_367 {
    private final Production90_367 production = new Production90_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}