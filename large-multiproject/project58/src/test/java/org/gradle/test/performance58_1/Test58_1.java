package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_1 {
    private final Production58_1 production = new Production58_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}