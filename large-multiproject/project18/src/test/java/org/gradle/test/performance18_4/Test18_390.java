package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_390 {
    private final Production18_390 production = new Production18_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}