package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_291 {
    private final Production26_291 production = new Production26_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}