package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_17 {
    private final Production87_17 production = new Production87_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}