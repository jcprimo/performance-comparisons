package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_25 {
    private final Production95_25 production = new Production95_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}