package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_455 {
    private final Production46_455 production = new Production46_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}