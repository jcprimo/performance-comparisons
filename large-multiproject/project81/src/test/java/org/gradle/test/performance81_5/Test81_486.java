package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_486 {
    private final Production81_486 production = new Production81_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}