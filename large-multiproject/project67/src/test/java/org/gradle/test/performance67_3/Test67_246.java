package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_246 {
    private final Production67_246 production = new Production67_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}