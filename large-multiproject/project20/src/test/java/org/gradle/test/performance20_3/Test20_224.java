package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_224 {
    private final Production20_224 production = new Production20_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}