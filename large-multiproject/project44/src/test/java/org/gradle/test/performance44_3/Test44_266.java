package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_266 {
    private final Production44_266 production = new Production44_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}