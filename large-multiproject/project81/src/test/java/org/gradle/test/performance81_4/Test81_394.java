package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_394 {
    private final Production81_394 production = new Production81_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}