package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_403 {
    private final Production21_403 production = new Production21_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}