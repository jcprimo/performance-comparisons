package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_179 {
    private final Production53_179 production = new Production53_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}