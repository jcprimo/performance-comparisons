package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_19 {
    private final Production44_19 production = new Production44_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}