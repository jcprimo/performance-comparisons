package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_332 {
    private final Production27_332 production = new Production27_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}