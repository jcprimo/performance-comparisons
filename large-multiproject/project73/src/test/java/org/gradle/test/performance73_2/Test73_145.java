package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_145 {
    private final Production73_145 production = new Production73_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}