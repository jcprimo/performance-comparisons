package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_165 {
    private final Production46_165 production = new Production46_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}