package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_434 {
    private final Production70_434 production = new Production70_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}