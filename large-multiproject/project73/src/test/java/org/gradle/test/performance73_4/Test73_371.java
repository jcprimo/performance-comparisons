package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_371 {
    private final Production73_371 production = new Production73_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}