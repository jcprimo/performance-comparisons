package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_452 {
    private final Production64_452 production = new Production64_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}