package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_140 {
    private final Production14_140 production = new Production14_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}