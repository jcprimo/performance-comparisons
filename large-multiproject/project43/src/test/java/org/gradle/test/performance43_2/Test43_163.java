package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_163 {
    private final Production43_163 production = new Production43_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}