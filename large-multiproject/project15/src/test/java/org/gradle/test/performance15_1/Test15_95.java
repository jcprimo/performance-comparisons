package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_95 {
    private final Production15_95 production = new Production15_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}