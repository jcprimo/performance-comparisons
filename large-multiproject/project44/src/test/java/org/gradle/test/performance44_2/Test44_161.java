package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_161 {
    private final Production44_161 production = new Production44_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}