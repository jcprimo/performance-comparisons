package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_47 {
    private final Production43_47 production = new Production43_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}