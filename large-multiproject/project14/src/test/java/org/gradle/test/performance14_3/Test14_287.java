package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_287 {
    private final Production14_287 production = new Production14_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}