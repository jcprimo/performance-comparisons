package org.gradle.test.performance96_4;

import static org.junit.Assert.*;

public class Test96_307 {
    private final Production96_307 production = new Production96_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}