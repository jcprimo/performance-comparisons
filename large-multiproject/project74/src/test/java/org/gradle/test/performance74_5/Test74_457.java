package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_457 {
    private final Production74_457 production = new Production74_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}