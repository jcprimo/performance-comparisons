package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_212 {
    private final Production98_212 production = new Production98_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}