package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_99 {
    private final Production68_99 production = new Production68_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}