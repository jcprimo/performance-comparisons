package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_44 {
    private final Production87_44 production = new Production87_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}