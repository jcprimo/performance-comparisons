package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_317 {
    private final Production72_317 production = new Production72_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}