package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_188 {
    private final Production36_188 production = new Production36_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}