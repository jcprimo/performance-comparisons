package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_388 {
    private final Production18_388 production = new Production18_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}