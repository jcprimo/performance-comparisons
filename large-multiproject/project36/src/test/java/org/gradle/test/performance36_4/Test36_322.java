package org.gradle.test.performance36_4;

import static org.junit.Assert.*;

public class Test36_322 {
    private final Production36_322 production = new Production36_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}