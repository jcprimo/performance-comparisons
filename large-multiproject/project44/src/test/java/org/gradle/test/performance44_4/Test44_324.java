package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_324 {
    private final Production44_324 production = new Production44_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}