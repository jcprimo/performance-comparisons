package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_115 {
    private final Production97_115 production = new Production97_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}