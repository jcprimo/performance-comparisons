package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_481 {
    private final Production74_481 production = new Production74_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}