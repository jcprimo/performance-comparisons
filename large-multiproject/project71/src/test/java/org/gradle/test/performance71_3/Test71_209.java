package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_209 {
    private final Production71_209 production = new Production71_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}