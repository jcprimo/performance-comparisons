package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_299 {
    private final Production87_299 production = new Production87_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}