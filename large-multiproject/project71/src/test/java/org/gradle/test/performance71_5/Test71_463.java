package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_463 {
    private final Production71_463 production = new Production71_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}