package org.gradle.test.performance21_4;

import static org.junit.Assert.*;

public class Test21_302 {
    private final Production21_302 production = new Production21_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}