package org.gradle.test.performance95_1;

import static org.junit.Assert.*;

public class Test95_36 {
    private final Production95_36 production = new Production95_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}