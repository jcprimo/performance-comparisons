package org.gradle.test.performance62_2;

import static org.junit.Assert.*;

public class Test62_111 {
    private final Production62_111 production = new Production62_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}