package org.gradle.test.performance96_5;

import static org.junit.Assert.*;

public class Test96_442 {
    private final Production96_442 production = new Production96_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}