package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_137 {
    private final Production97_137 production = new Production97_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}