package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_482 {
    private final Production74_482 production = new Production74_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}