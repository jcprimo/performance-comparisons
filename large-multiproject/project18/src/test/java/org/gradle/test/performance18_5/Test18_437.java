package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_437 {
    private final Production18_437 production = new Production18_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}