package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_227 {
    private final Production30_227 production = new Production30_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}