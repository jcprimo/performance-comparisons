package org.gradle.test.performance81_1;

import static org.junit.Assert.*;

public class Test81_52 {
    private final Production81_52 production = new Production81_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}