package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_66 {
    private final Production30_66 production = new Production30_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}