package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_136 {
    private final Production74_136 production = new Production74_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}