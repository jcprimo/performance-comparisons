package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_454 {
    private final Production36_454 production = new Production36_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}