package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_47 {
    private final Production53_47 production = new Production53_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}