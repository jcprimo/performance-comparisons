package org.gradle.test.performance76_1;

import static org.junit.Assert.*;

public class Test76_4 {
    private final Production76_4 production = new Production76_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}