package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_376 {
    private final Production12_376 production = new Production12_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}