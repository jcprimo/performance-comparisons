package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_73 {
    private final Production35_73 production = new Production35_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}