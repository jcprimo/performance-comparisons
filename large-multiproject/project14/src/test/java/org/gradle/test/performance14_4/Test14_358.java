package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_358 {
    private final Production14_358 production = new Production14_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}