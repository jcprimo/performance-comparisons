package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_311 {
    private final Production74_311 production = new Production74_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}