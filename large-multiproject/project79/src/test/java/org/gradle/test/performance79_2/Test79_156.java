package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_156 {
    private final Production79_156 production = new Production79_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}