package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_402 {
    private final Production68_402 production = new Production68_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}