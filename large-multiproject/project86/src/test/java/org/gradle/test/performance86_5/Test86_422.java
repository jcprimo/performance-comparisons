package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_422 {
    private final Production86_422 production = new Production86_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}