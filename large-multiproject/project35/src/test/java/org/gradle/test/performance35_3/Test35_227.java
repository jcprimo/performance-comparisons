package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_227 {
    private final Production35_227 production = new Production35_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}