package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_111 {
    private final Production17_111 production = new Production17_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}