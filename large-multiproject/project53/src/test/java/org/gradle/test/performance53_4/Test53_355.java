package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_355 {
    private final Production53_355 production = new Production53_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}