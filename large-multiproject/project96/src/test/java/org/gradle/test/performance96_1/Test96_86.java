package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_86 {
    private final Production96_86 production = new Production96_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}