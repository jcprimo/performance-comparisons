package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_156 {
    private final Production24_156 production = new Production24_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}