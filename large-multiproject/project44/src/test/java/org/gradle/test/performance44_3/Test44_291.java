package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_291 {
    private final Production44_291 production = new Production44_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}