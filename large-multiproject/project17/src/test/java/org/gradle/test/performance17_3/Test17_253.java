package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_253 {
    private final Production17_253 production = new Production17_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}