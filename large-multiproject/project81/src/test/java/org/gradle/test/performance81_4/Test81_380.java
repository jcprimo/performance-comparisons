package org.gradle.test.performance81_4;

import static org.junit.Assert.*;

public class Test81_380 {
    private final Production81_380 production = new Production81_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}