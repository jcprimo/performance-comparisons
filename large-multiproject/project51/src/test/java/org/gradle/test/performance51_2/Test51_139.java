package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_139 {
    private final Production51_139 production = new Production51_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}