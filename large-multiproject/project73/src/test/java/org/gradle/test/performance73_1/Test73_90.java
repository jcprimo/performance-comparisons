package org.gradle.test.performance73_1;

import static org.junit.Assert.*;

public class Test73_90 {
    private final Production73_90 production = new Production73_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}