package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_91 {
    private final Production13_91 production = new Production13_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}