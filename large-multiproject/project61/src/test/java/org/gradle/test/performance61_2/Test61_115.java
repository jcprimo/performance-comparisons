package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_115 {
    private final Production61_115 production = new Production61_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}