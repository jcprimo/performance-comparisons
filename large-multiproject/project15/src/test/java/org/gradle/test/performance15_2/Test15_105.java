package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_105 {
    private final Production15_105 production = new Production15_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}