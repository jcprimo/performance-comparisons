package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_87 {
    private final Production53_87 production = new Production53_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}