package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_44 {
    private final Production37_44 production = new Production37_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}