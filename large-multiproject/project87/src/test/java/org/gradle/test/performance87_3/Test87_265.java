package org.gradle.test.performance87_3;

import static org.junit.Assert.*;

public class Test87_265 {
    private final Production87_265 production = new Production87_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}