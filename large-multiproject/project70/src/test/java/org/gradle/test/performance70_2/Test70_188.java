package org.gradle.test.performance70_2;

import static org.junit.Assert.*;

public class Test70_188 {
    private final Production70_188 production = new Production70_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}