package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_367 {
    private final Production73_367 production = new Production73_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}