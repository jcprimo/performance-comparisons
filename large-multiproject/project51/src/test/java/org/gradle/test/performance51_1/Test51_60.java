package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_60 {
    private final Production51_60 production = new Production51_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}