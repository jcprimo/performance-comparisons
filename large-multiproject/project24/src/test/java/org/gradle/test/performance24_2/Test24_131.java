package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_131 {
    private final Production24_131 production = new Production24_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}