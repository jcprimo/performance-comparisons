package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_26 {
    private final Production21_26 production = new Production21_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}