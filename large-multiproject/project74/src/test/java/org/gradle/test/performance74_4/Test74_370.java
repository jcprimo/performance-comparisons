package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_370 {
    private final Production74_370 production = new Production74_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}