package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_292 {
    private final Production45_292 production = new Production45_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}