package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_22 {
    private final Production68_22 production = new Production68_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}