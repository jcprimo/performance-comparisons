package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_489 {
    private final Production51_489 production = new Production51_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}