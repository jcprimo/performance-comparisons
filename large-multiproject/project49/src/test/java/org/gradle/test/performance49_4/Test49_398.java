package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_398 {
    private final Production49_398 production = new Production49_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}