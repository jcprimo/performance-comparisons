package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_376 {
    private final Production96_376 production = new Production96_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}