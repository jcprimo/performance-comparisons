package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_40 {
    private final Production14_40 production = new Production14_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}