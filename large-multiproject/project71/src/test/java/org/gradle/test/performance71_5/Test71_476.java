package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_476 {
    private final Production71_476 production = new Production71_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}