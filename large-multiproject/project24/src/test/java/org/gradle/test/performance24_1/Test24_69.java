package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_69 {
    private final Production24_69 production = new Production24_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}