package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_16 {
    private final Production89_16 production = new Production89_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}