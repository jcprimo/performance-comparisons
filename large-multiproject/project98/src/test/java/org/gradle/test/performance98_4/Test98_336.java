package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_336 {
    private final Production98_336 production = new Production98_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}