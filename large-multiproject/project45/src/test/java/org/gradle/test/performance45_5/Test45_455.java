package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_455 {
    private final Production45_455 production = new Production45_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}