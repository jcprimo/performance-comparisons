package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_160 {
    private final Production27_160 production = new Production27_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}