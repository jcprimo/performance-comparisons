package org.gradle.test.performance36_3;

import static org.junit.Assert.*;

public class Test36_251 {
    private final Production36_251 production = new Production36_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}