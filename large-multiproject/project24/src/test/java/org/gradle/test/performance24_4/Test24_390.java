package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_390 {
    private final Production24_390 production = new Production24_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}