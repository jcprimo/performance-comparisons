package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_3 {
    private final Production71_3 production = new Production71_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}