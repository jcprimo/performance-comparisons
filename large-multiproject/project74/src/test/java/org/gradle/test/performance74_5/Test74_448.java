package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_448 {
    private final Production74_448 production = new Production74_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}