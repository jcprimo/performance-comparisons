package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_316 {
    private final Production12_316 production = new Production12_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}