package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_26 {
    private final Production27_26 production = new Production27_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}