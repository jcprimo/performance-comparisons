package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_400 {
    private final Production94_400 production = new Production94_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}