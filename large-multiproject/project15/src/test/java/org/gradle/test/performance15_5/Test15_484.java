package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_484 {
    private final Production15_484 production = new Production15_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}