package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_2 {
    private final Production12_2 production = new Production12_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}