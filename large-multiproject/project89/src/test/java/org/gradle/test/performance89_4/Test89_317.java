package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_317 {
    private final Production89_317 production = new Production89_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}