package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_428 {
    private final Production70_428 production = new Production70_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}