package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_65 {
    private final Production50_65 production = new Production50_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}