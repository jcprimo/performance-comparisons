package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_445 {
    private final Production50_445 production = new Production50_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}