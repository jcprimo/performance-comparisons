package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_192 {
    private final Production64_192 production = new Production64_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}