package org.gradle.test.performance51_4;

import static org.junit.Assert.*;

public class Test51_311 {
    private final Production51_311 production = new Production51_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}