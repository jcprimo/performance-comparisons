package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_332 {
    private final Production74_332 production = new Production74_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}