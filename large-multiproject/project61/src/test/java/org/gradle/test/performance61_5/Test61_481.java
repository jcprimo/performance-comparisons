package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_481 {
    private final Production61_481 production = new Production61_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}