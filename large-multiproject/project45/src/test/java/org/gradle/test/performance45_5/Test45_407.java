package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_407 {
    private final Production45_407 production = new Production45_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}