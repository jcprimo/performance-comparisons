package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_66 {
    private final Production58_66 production = new Production58_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}