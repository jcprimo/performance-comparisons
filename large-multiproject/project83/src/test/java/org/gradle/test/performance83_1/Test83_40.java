package org.gradle.test.performance83_1;

import static org.junit.Assert.*;

public class Test83_40 {
    private final Production83_40 production = new Production83_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}