package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_22 {
    private final Production66_22 production = new Production66_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}