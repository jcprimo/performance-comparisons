package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_467 {
    private final Production65_467 production = new Production65_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}