package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_261 {
    private final Production70_261 production = new Production70_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}