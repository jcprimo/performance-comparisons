package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_452 {
    private final Production12_452 production = new Production12_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}