package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_107 {
    private final Production71_107 production = new Production71_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}