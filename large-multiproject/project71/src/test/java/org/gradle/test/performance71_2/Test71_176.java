package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_176 {
    private final Production71_176 production = new Production71_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}