package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_24 {
    private final Production72_24 production = new Production72_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}