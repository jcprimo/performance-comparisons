package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_372 {
    private final Production74_372 production = new Production74_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}