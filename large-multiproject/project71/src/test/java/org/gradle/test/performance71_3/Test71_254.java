package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_254 {
    private final Production71_254 production = new Production71_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}