package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_446 {
    private final Production25_446 production = new Production25_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}