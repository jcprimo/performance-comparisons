package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_243 {
    private final Production17_243 production = new Production17_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}