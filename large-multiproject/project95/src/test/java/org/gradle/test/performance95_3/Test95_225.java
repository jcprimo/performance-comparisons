package org.gradle.test.performance95_3;

import static org.junit.Assert.*;

public class Test95_225 {
    private final Production95_225 production = new Production95_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}