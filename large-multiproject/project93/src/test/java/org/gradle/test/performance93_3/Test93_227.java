package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_227 {
    private final Production93_227 production = new Production93_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}