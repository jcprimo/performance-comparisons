package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_31 {
    private final Production26_31 production = new Production26_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}