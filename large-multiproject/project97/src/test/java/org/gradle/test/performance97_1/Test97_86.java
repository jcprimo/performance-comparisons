package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_86 {
    private final Production97_86 production = new Production97_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}