package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_166 {
    private final Production50_166 production = new Production50_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}