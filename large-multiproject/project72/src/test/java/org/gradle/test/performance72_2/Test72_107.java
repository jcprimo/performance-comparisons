package org.gradle.test.performance72_2;

import static org.junit.Assert.*;

public class Test72_107 {
    private final Production72_107 production = new Production72_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}