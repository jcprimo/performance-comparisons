package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_272 {
    private final Production15_272 production = new Production15_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}