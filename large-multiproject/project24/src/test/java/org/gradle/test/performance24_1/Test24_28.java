package org.gradle.test.performance24_1;

import static org.junit.Assert.*;

public class Test24_28 {
    private final Production24_28 production = new Production24_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}