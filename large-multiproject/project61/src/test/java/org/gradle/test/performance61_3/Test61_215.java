package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_215 {
    private final Production61_215 production = new Production61_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}