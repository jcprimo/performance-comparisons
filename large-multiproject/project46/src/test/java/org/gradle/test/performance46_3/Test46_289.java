package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_289 {
    private final Production46_289 production = new Production46_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}