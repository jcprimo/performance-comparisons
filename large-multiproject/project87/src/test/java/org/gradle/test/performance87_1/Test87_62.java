package org.gradle.test.performance87_1;

import static org.junit.Assert.*;

public class Test87_62 {
    private final Production87_62 production = new Production87_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}