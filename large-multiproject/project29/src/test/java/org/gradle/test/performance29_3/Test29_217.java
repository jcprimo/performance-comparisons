package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_217 {
    private final Production29_217 production = new Production29_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}