package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_238 {
    private final Production98_238 production = new Production98_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}