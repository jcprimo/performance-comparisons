package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_111 {
    private final Production88_111 production = new Production88_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}