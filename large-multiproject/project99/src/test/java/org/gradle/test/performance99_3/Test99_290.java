package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_290 {
    private final Production99_290 production = new Production99_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}