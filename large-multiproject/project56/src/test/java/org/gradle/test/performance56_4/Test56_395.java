package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_395 {
    private final Production56_395 production = new Production56_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}