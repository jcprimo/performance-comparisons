package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_293 {
    private final Production43_293 production = new Production43_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}