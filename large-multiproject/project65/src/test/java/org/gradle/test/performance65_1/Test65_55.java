package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_55 {
    private final Production65_55 production = new Production65_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}