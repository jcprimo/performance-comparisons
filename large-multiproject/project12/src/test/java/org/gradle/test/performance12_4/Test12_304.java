package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_304 {
    private final Production12_304 production = new Production12_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}