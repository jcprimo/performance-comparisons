package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_489 {
    private final Production46_489 production = new Production46_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}