package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_380 {
    private final Production67_380 production = new Production67_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}