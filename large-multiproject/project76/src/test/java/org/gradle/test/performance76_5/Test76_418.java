package org.gradle.test.performance76_5;

import static org.junit.Assert.*;

public class Test76_418 {
    private final Production76_418 production = new Production76_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}