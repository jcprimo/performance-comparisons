package org.gradle.test.performance74_4;

import static org.junit.Assert.*;

public class Test74_303 {
    private final Production74_303 production = new Production74_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}