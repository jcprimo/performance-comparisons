package org.gradle.test.performance72_1;

import static org.junit.Assert.*;

public class Test72_46 {
    private final Production72_46 production = new Production72_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}