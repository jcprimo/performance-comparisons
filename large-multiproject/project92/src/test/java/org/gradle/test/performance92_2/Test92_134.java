package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_134 {
    private final Production92_134 production = new Production92_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}