package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_205 {
    private final Production99_205 production = new Production99_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}