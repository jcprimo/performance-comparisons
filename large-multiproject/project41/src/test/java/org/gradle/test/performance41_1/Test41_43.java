package org.gradle.test.performance41_1;

import static org.junit.Assert.*;

public class Test41_43 {
    private final Production41_43 production = new Production41_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}