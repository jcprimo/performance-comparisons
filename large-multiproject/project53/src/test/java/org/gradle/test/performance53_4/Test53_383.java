package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_383 {
    private final Production53_383 production = new Production53_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}